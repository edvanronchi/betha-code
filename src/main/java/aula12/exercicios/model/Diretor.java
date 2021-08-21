package aula12.exercicios.model;

public class Diretor extends Funcionario{

    public Diretor(Long id, String nome, String cpf, Double salario) {
        super(id, nome, cpf, salario);
    }

    public void bonificacao(Double bonus) {
        setSalario(this.getSalario() * (1 + (bonus/100)));
    }
}
