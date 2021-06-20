package aula04;

public class Exercicio03 {

    /*
        Converta este laço do exercício anterior para um do-while.
    */

    public static void main(String[] args) {

        Integer y = 1;
        Integer x = 10;

        do {
            y++;

            System.out.println(x);

            x++;
        } while (y <= 20);
    }
}