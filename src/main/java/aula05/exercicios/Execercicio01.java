package aula05.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Execercicio01 {

    /*
       Crie um programa que percorra um array de 10 posições e imprima o seu conteúdo.
    */

    public static void main(String[] args) {
        List lista = new ArrayList<>();

        lista.add(1);
        lista.add("ABC");
        lista.add(3.2);
        lista.add(true);
        lista.add("a");
        lista.add("b");
        lista.add(false);
        lista.add(8);
        lista.add("c");
        lista.add(1450.14);

        lista.stream().forEach( i -> {
            System.out.println(i);
        });
    }
}
