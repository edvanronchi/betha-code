package aula07.conteudo;

public class Apartamento extends Construcao {
    public Integer andar;

    public Apartamento(Double tamanho, String endereco, String construtora, Double valor, Integer periodo, Integer andar) {
        super(tamanho, endereco, construtora, valor, periodo);
        this.andar = andar;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }
}
