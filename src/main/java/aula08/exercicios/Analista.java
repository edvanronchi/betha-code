package aula08.exercicios;

public class Analista extends Funcionario{

    public Analista(String nome, String cpf) {
        super(nome, cpf);
    }

    public Analista(String nome) {
        super(nome);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() + (super.getSalarioBruto() * 0.1);
    }
}