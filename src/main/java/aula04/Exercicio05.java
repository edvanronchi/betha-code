package aula04;

import java.util.Scanner;

public class Exercicio05 {

    /*
        Implemente um programa para calcular a área de um trapézio, onde: h = altura b = base menor B = base maior Área = (h.(b+B))/2
    */

    public static void main(String[] args) {

        desenharTrapezio();

        Scanner scanner = new Scanner(System.in);

        Double b = validarNumero(scanner, "Digite a base menor do trapezio: ", "b", 0.0);
        Double h = validarNumero(scanner, "Digite a altura do trapezio: ", "h", 0.0);
        Double B = validarNumero(scanner, "Digite a base maior do trapezio: ", "B", b);

        Double resultado = (h*(b+B))/2;

        System.out.println("Área total: " + resultado);
    }

    public static double validarNumero(Scanner scanner, String mensagem, String principal, Double dependente) {

        while (true) {
            try {
                System.out.print(mensagem);

                Double tamanho = Double.parseDouble(scanner.nextLine());

                if (tamanho <= 0) {
                    System.out.println("O tamanho não pode ser negativo!");
                    continue;
                }

                if (principal.equals("B") && dependente >= tamanho) {
                    System.out.println("A base maior não pode ser menor ou igual a base menor!");
                    continue;
                }

                return tamanho;
            } catch (NumberFormatException e) {
                System.out.println("Letras ou caracteres especiais não serão validos!");
            }
        }
    }

    public static void desenharTrapezio() {
        System.out.println("            b");
        System.out.println("      ______________");
        System.out.println("     /|             \\");
        System.out.println("    / |              \\         b = base menor");
        System.out.println("   /  | h             \\        h = altura");
        System.out.println("  /   |                \\       B = base maior");
        System.out.println(" /    |                 \\");
        System.out.println("/_____|__________________\\");
        System.out.println("             B");
    }
}