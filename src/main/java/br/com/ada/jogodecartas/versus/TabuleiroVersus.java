package br.com.ada.jogodecartas.versus;

import br.com.ada.jogodecartas.Tabuleiro;

public class TabuleiroVersus extends Tabuleiro {
    @Override
    public Integer limiteDeDecks() {
        return 2;
    }
}
