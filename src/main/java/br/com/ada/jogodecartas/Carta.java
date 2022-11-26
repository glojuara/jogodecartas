package br.com.ada.jogodecartas;

public abstract class Carta {
    private final String nome;
    private final String tipo;
    private final Integer custo;

    public Carta(String nome, String tipo, Integer custo) {
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getCusto() {
        return custo;
    }
}
