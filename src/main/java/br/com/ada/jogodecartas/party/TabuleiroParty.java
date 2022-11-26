package br.com.ada.jogodecartas.party;

import br.com.ada.jogodecartas.Tabuleiro;

public class TabuleiroParty extends Tabuleiro {

    @Override
    public Integer limiteDeDecks() {
        return 5;
    }
}
