package aula08.conteudo.matricula;

public class Funcionario extends Matricula{

    public Funcionario(Double salario) {
        super(salario);
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + (super.getSalario() * 0.2);
    }
}
