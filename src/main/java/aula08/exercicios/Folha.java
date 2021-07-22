package aula08.exercicios;

import java.util.Date;
import java.util.List;

public class Folha {

    private Long id = new Date().getTime();
    private Funcionario funcionario;
    private Date dataPagamento;
    private Double salarioLiquido;

    public Folha(Funcionario funcionario, Date dataPagamento) {
        this.funcionario = funcionario;
        this.dataPagamento = dataPagamento;
    }

    public void calcular() {
        Tabela tabela = new Tabela(funcionario.getSalarioBruto());

        System.out.println(tabela.IRRF());
        System.out.println(tabela.INSS());

        this.salarioLiquido = funcionario.getSalarioBruto() - (tabela.IRRF() + tabela.INSS());
    }

    public void calcular(List<Descontos> listaDesconto, Double bonus) {

        Double descontos = listaDesconto.stream().mapToDouble(Descontos::getValor).sum();

        Double base = funcionario.getSalarioBruto() - descontos + bonus;

        Tabela tabela = new Tabela(base);

        this.salarioLiquido = base - (tabela.IRRF() + tabela.INSS());
    }

    public void calcular(List<Descontos> listaDesconto) {
        calcular(listaDesconto, 0.00);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }
}