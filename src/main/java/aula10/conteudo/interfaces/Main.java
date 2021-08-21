package aula10.conteudo.interfaces;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(9.0, "Quadrado");
        Triangulo triangulo = new Triangulo(9.0, 9.0, "Triangulo");

        System.out.println("Quadrado");
        System.out.println("Área: " + quadrado.getArea());
        System.out.println("Perimetro: " + quadrado.getPerimetro());
        System.out.println("Lado: " + quadrado.getLado());
        System.out.println("=================");

        System.out.println("Triangulo");
        System.out.println("Área: " + triangulo.getArea());
        System.out.println("Perimetro: " + triangulo.getPerimetro());
        System.out.println("Lado A: " + triangulo.getLadoA());
        System.out.println("Lado B: " + triangulo.getLadoB());
        System.out.println("Lado C: " + triangulo.getLadoC());
        System.out.println("=================");
    }
}
