package aula10.conteudo.interfaces;

public class Quadrado implements FiguraGeometrica{

    private Double lado;
    private String nomeFigura;

    public Quadrado(Double lado, String nomeFigura) {
        this.lado = lado;
        this.nomeFigura = nomeFigura;
    }

    @Override
    public String getNomeFigura() {
        return null;
    }

    @Override
    public Double getArea() {
        return this.lado * this.lado;
    }

    @Override
    public Double getPerimetro() {
        return this.lado * 4;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}