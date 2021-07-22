package aula08.exercicios;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioBuilder {

    public static void main(String[] args) {
        //Cria os funcionarios
        Funcionario funcionario1 = contratarFuncionario("Edvan", TipoFuncionario.ANALISTA, 3000.00);
        Funcionario funcionario2 = contratarFuncionario("Bruno", TipoFuncionario.ARQUITETO, 15000.00);

        //Cria a lista de descontos
        List<Descontos> funcionario1ListaDesconto = new ArrayList<>();

        funcionario1ListaDesconto.add(new Descontos("Consulta", 20.00));
        funcionario1ListaDesconto.add(new Descontos("Livro", 50.00));

        //Faz o calculo da folha de pagamento
        String dataPagamento = "2021-08-01";

        Folha funcionario1Folha = new Folha(funcionario1, Date.valueOf(dataPagamento));
        Folha funcionario2Folha = new Folha(funcionario2, Date.valueOf(dataPagamento));

        funcionario1Folha.calcular(funcionario1ListaDesconto, 50.00);
        funcionario2Folha.calcular();

        //Imprime a folha de pagamento
        funcionario1Folha.imprimirFolha();
        funcionario2Folha.imprimirFolha();
    }

    public static Funcionario contratarFuncionario(String nome, TipoFuncionario tipoFuncionario, Double salarioBruto,String cpf) {

        switch (tipoFuncionario) {
            case ESTAGIARIO:
                return new Estagiario(nome, cpf, salarioBruto);
            case ANALISTA:
                return new Analista(nome, cpf, salarioBruto);
            case ARQUITETO:
                return new Arquiteto(nome, cpf, salarioBruto);
            case COORDENADOR:
                return new Coordenador(nome, cpf, salarioBruto);
            default:
                return new Funcionario(nome, cpf, salarioBruto);
        }
    }

    public static Funcionario contratarFuncionario(String nome, TipoFuncionario tipoFuncionario, Double salarioBruto) {
        return contratarFuncionario(nome, tipoFuncionario, salarioBruto, null);
    }
}