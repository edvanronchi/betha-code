package aula08.conteudo.matricula;

public class Estagiario extends Matricula{

    public Estagiario(Double salario) {
        super(salario);
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + (super.getSalario() * 0.1);
    }
}