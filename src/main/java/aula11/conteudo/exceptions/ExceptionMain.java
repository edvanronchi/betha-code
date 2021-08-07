package aula11.conteudo.exceptions;

public class ExceptionMain {
    public static void main(String[] args) {
        Integer numero = 2;

        try {

            if (numero > 10) {
                throw new ValorMaiorException("Valor maior do que 10!");
            } else if (numero < 3) {
                throw new ValorMenorException("Valor menor do que 3!");
            } else {
                System.out.println("Numero correto!");
            }

        } catch (ValorMaiorException | ValorMenorException e) {
            System.out.println(e);
        }
    }
}