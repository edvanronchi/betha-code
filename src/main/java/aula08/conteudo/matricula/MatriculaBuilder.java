package aula08.conteudo.matricula;

public class MatriculaBuilder {

    public static void main(String[] args) {
        System.out.println(run("Funcionario", 1500.0).getSalario());
    }

    public static Matricula run(String tipoMatricula, Double salario) {

        switch (tipoMatricula) {
            case "Funcionario":
                return new Funcionario(salario);
            case "Estagiario":
                return new Estagiario(salario);
            default:
                return new Matricula(salario);
        }
    }
}
