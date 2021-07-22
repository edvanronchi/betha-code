package aula07.conteudo;

public class Casa extends Construcao{
    private String cor;

    public Casa(Double tamanho, String endereco, String construtora, Double valor, Integer periodo, String cor) {
        super(tamanho, endereco, construtora, valor, periodo);
        this.cor = cor;
    }

    public String limparTerreno() {
        return "O terreno foi limpo!";
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
