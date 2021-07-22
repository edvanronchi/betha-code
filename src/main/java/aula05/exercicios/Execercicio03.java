package aula05.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Execercicio03 {

    /*
        Faça um programa que inverta as posições de um array com 10 elementos.
    */

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(41);
        lista.add(5);
        lista.add(2);
        lista.add(25);
        lista.add(3);
        lista.add(7);
        lista.add(0);
        lista.add(45);
        lista.add(7);

        System.out.println("Antes: " + lista);

        Collections.reverse(lista);

        System.out.println("Depois: " + lista);
    }
}
