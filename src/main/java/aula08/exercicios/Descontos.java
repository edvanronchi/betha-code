package aula08.exercicios;

import java.util.Date;

public class Descontos {

    private Long id = new Date().getTime();
    private String descricao;
    private Double valor;

    public Descontos(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}