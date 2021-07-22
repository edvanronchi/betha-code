package aula05.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Execercicio02 {

    /*
        Escreva um programa que some todos os valores contidos em um array de inteiros e calcule a média.
    */

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(3);
        lista.add(5);
        lista.add(2);
        lista.add(4);
        lista.add(3);
        lista.add(7);
        lista.add(0);

        System.out.println("Média: " + lista.stream().reduce(0, Integer::sum));
    }
}