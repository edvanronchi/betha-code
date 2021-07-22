package aula08.conteudo.calculadora;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println(calcular(1, 2));
        System.out.println(calcular(1.2, 2.8));
        System.out.println(calcular("3", "9"));
    }

    public static Integer calcular(Integer a, Integer b) {
        return a + b;
    }

    public static Double calcular(Double a, Double b) {
        return a + b;
    }

    public static String calcular(String a, String b) {
        return a + b;
    }
}
