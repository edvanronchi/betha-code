package aula04.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {

    /*
        Implemente um programa que recebe um número de 1 a 7 e imprime o dia da semana correspondente.
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer numero = validarNumero(scanner, "Digite um número de 1 a 7: ");

        String semana[] = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"};

        System.out.println(semana[numero-1]);
    }

    public static int validarNumero(Scanner scanner, String mensagem) {

        while (true) {
            try {
                System.out.print(mensagem);

                Integer numero = Integer.parseInt(scanner.nextLine());

                if (numero >= 1 && numero <= 7) {
                    return numero;
                }

                System.out.println("Por favor, digite um número de 1 a 7!");
            } catch (NumberFormatException e) {
                System.out.println("Letras ou caracteres especiais não serão validos!");
            }
        }
    }
}