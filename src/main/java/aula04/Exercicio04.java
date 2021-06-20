package aula04;

import java.util.Scanner;

public class Exercicio04 {

    /*
        Desenvolva um programa que solicita ao usuário um número inteiro de no máximo 4 dígitos. Inverta esse número.
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String numeroInvertido = "";

        String numero = validarNumero(scanner, "Digite um número inteiro de até 4 digitos: ");

        for (int i = (numero.toCharArray().length-1); i >= 0; i--) {

            if ((Integer.parseInt(numero) < 0 && i == (numero.toCharArray().length-1))) {
                numeroInvertido += "-";
            }

            if (numero.toCharArray()[i] == "-".toCharArray()[0]) {
                continue;
            }

            numeroInvertido += numero.toCharArray()[i];
        }

        System.out.println(numeroInvertido);
    }

    public static String validarNumero(Scanner scanner, String mensagem) {

        while (true) {
            try {
                System.out.print(mensagem);

                Integer numero = Integer.parseInt(scanner.nextLine());

                if (numero >= -9999 && numero <= 9999) {
                    return numero.toString();
                }

                System.out.println("Por favor, digite um número com até 4 digitos!");
            } catch (NumberFormatException e) {
                System.out.println("Letras ou caracteres especiais não serão validos!");
            }
        }
    }
} 