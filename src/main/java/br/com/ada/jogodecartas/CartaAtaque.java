package br.com.ada.jogodecartas;

public class CartaAtaque extends Carta implements CartaDeAtaque {

    private final Integer poder;
    private final Integer resistencia;

    public CartaAtaque(String nome, String tipo, Integer custo, Integer poder, Integer resistencia) {
        super(nome, tipo, custo);
        this.poder = poder;
        this.resistencia = resistencia;
    }

    @Override
    public Integer verPoder() {
        return poder;
    }

    @Override
    public Integer verResistencia() {
        return resistencia;
    }
}
