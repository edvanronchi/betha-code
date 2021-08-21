package aula08.exercicios;

public class Analista extends Funcionario{

    public Analista(String nome, String cpf, Double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    public Analista(String nome, String cpf) {
        super(nome, cpf);
    }

    public Analista(String nome) {
        super(nome);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.1;
    }
}