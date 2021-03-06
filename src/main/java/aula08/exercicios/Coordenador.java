package aula08.exercicios;

public class Coordenador extends Funcionario{

    public Coordenador(String nome, String cpf, Double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    public Coordenador(String nome, String cpf) {
        super(nome, cpf);
    }

    public Coordenador(String nome) {
        super(nome);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.2;
    }
}