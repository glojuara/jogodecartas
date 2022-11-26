package br.com.ada.jogodecartas.factory;

import br.com.ada.jogodecartas.Deck;
import br.com.ada.jogodecartas.Tabuleiro;
import br.com.ada.jogodecartas.versus.DeckVersus;
import br.com.ada.jogodecartas.versus.TabuleiroVersus;

public class VersusGameFactory implements GameFactory{
    @Override
    public Tabuleiro criarTabuleiro() {
        return new TabuleiroVersus();
    }

    @Override
    public Deck criarDeck() {
        return new DeckVersus();
    }
}
