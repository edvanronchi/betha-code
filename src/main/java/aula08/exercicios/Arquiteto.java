package aula08.exercicios;

public class Arquiteto extends Funcionario{

    public Arquiteto(String nome, String cpf) {
        super(nome, cpf);
    }

    public Arquiteto(String nome) {
        super(nome);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() + (super.getSalarioBruto() * 0.15);
    }
}