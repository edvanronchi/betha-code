package aula07.conteudo;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa(190.0, "Rua da Betha", "Constutora teste", 150000.0, 24, "Vermelha");

        System.out.println(casa.getCor());
        System.out.println(casa.limparTerreno());
    }
}
