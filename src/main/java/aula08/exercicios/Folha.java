package aula08.exercicios;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Folha {

    private Long id = new Date().getTime();
    private Funcionario funcionario;
    private Date dataPagamento;
    private Double salarioLiquido;
    private Double descontos;
    private Double bonus;
    private Tabela tabela = new Tabela();

    public Folha(Funcionario funcionario, Date dataPagamento) {
        this.funcionario = funcionario;
        this.dataPagamento = dataPagamento;
    }

    public void calcular() {
        calcular(null);
    }

    public void calcular(List<Descontos> listaDesconto) {
        calcular(listaDesconto, 0.00);
    }

    public void calcular(List<Descontos> listaDesconto, Double bonus) {
        Double descontos = 0.00;
        Double salarioBruto = funcionario.getSalarioBruto();

        if (listaDesconto != null) {
            descontos = listaDesconto.stream().mapToDouble(Descontos::getValor).sum();
        }

        Double base = salarioBruto - descontos + bonus;
        Double baseInss = salarioBruto;
        Double baseIrrf = salarioBruto - tabela.INSS(baseInss);

        this.bonus = bonus;
        this.descontos = descontos + tabela.IRRF(baseIrrf) + tabela.INSS(baseInss);
        this.salarioLiquido = base - (tabela.IRRF(baseIrrf) + tabela.INSS(baseInss));
    }

    public void imprimirFolha() {
        System.out.println("==============================");
        System.out.println("=      FOLHA DE PAGAMENTO    =");
        System.out.println("==============================");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getClass().getSimpleName());
        System.out.println("Data Pagamento: " + formatarData(dataPagamento));
        System.out.println("Salario Bruto: " + formatarDinheiro(funcionario.getSalarioBruto()));
        System.out.println("Bônus: " + formatarDinheiro(bonus));
        System.out.println("Descontos: " + formatarDinheiro(descontos));
        System.out.println("Salario Liquido: " + formatarDinheiro(salarioLiquido));
        System.out.println("==============================\n");
    }

    public static String formatarData(Date data) {
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }

    public static String formatarDinheiro(Double valor) {
        return new DecimalFormat("#,###.##").format(valor);
    }

    public Long getId() {
        return id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }
}