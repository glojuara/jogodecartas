package br.com.ada.jogodecartas;

public class CartaDefesa extends Carta implements CartaDeDefesa {

    public CartaDefesa(String nome, String tipo, Integer custo) {
        super(nome, tipo, custo);
    }

    @Override
    public Integer verResistencia() {
        return null;
    }

    @Override
    public String verEfeito() {
        return null;
    }

}
