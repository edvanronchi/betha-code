package aula07.conteudo;

public class Construcao extends Terreno{
    private String construtora;
    private Double valor;
    private Integer periodo;

    public Construcao(Double tamanho, String endereco, String construtora, Double valor, Integer periodo) {
        super(tamanho, endereco);
        this.construtora = construtora;
        this.valor = valor;
        this.periodo = periodo;
    }

    public String getConstrutora() {
        return construtora;
    }

    public void setConstrutora(String construtora) {
        this.construtora = construtora;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }
}
