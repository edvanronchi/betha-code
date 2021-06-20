package aula04;

public class Exercicio06 {

    /*
        Faça um programa que imprima os quadrados dos números inteiros ímpares entre 15 e 35.
    */

    public static void main(String[] args) {

        for (int i = 15; i <= 35; i++) {

            if (i%2 == 0) {
                continue;
            }

            System.out.println(i + " >> " + (int) Math.pow(i, 2));
        }
    }
} 