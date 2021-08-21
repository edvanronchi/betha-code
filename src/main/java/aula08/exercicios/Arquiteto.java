package aula08.exercicios;

public class Arquiteto extends Funcionario{

    public Arquiteto(String nome, String cpf, Double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    public Arquiteto(String nome, String cpf) {
        super(nome, cpf);
    }

    public Arquiteto(String nome) {
        super(nome);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.15;
    }
}