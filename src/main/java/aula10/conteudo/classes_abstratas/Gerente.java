package aula10.conteudo.classes_abstratas;

public class Gerente extends Funcionario{

    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonificacao() {
        return super.getSalario() * 1.2;
    }
}
