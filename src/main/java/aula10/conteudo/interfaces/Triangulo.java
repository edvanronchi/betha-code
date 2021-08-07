package aula10.conteudo.interfaces;

public class Triangulo implements FiguraGeometrica{

    private Double base;
    private Double altura;
    private Double ladoA;
    private Double ladoB;
    private Double ladoC;
    private String nomeFigura;

    public Triangulo(Double base, Double altura, String nomeFigura) {
        this.base = base;
        this.altura = altura;
        this.nomeFigura = nomeFigura;
        this.ladoA = Math.sqrt(Math.pow(altura, 2) + (Math.pow(base, 2) / 4));
        this.ladoB = ladoA;
        this.ladoC = base;
    }

    @Override
    public String getNomeFigura() {
        return nomeFigura;
    }

    @Override
    public Double getArea() {
        return (base * altura) / 2;
    }

    @Override
    public Double getPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLadoA() {
        return ladoA;
    }

    public void setLadoA(Double ladoA) {
        this.ladoA = ladoA;
    }

    public Double getLadoB() {
        return ladoB;
    }

    public void setLadoB(Double ladoB) {
        this.ladoB = ladoB;
    }

    public Double getLadoC() {
        return ladoC;
    }

    public void setLadoC(Double ladoC) {
        this.ladoC = ladoC;
    }
}