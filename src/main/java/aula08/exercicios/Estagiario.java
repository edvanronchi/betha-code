package aula08.exercicios;

public class Estagiario extends Funcionario{

    public Estagiario(String nome, String cpf, Double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    public Estagiario(String nome, String cpf) {
        super(nome, cpf);
    }

    public Estagiario(String nome) {
        super(nome);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.05;
    }
}