package br.com.ada.jogodecartas;

public class CartaAtaqueEspecial extends CartaAtaque implements CartaComEfeito {

    private final String efeito;

    public CartaAtaqueEspecial(String nome, String tipo, Integer custo, Integer poder, Integer resistencia, String efeito) {
        super(nome, tipo, custo, poder, resistencia);
        this.efeito = efeito;
    }


    @Override
    public String verEfeito() {
        return efeito;
    }


}
