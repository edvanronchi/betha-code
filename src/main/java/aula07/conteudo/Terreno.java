package aula07.conteudo;

public class Terreno {
    private Double tamanho;
    private String endereco;

    public Terreno(Double tamanho, String endereco) {
        this.tamanho = tamanho;
        this.endereco = endereco;
    }

    public String limparTerreno() {
        return "Terreno limpo!";
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}