package aula08.exercicios;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioBuilder {

    public static void main(String[] args) {
        Funcionario estagiario = new Estagiario("Bruno");
        List<Descontos> estagiarioListaDesconto = new ArrayList<>();

        estagiarioListaDesconto.add(new Descontos("Consulta", 20.00));
        estagiarioListaDesconto.add(new Descontos("Livro", 50.00));

        estagiario.setSalarioBruto(10000.00);

        Folha estagiario1Folha = new Folha(estagiario, Date.valueOf("2021-07-22"));

        estagiario1Folha.calcular();

        System.out.println(estagiario.getSalarioBruto());
        System.out.println(estagiario1Folha.getSalarioLiquido());
    }
}
