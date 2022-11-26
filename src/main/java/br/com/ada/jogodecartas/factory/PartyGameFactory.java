package br.com.ada.jogodecartas.factory;

import br.com.ada.jogodecartas.Deck;
import br.com.ada.jogodecartas.Tabuleiro;
import br.com.ada.jogodecartas.party.DeckParty;
import br.com.ada.jogodecartas.party.TabuleiroParty;

public class PartyGameFactory implements GameFactory {
    @Override
    public Tabuleiro criarTabuleiro() {
        return new TabuleiroParty();
    }

    @Override
    public Deck criarDeck() {
        return new DeckParty();
    }
}
