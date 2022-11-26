package br.com.ada.jogodecartas.team;

import br.com.ada.jogodecartas.Tabuleiro;

public class TabuleiroTeam extends Tabuleiro {

    @Override
    public Integer limiteDeDecks() {
        return 5;
    }
}
