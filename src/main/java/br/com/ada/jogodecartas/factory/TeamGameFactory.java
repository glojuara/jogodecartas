package br.com.ada.jogodecartas.factory;

import br.com.ada.jogodecartas.Deck;
import br.com.ada.jogodecartas.Tabuleiro;
import br.com.ada.jogodecartas.team.DeckTeam;
import br.com.ada.jogodecartas.team.TabuleiroTeam;

public class TeamGameFactory implements GameFactory {
    @Override
    public Tabuleiro criarTabuleiro() {
        return new TabuleiroTeam();
    }

    @Override
    public Deck criarDeck() {
        return new DeckTeam();
    }
}
