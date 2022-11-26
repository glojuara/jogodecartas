package br.com.ada.jogodecartas;

import java.util.ArrayList;
import java.util.List;

public abstract class Tabuleiro {

    private final List<Deck> decks;

    protected Tabuleiro() {
        this.decks = new ArrayList<>();
    }

    public abstract Integer limiteDeDecks();

    public boolean adicionarDeck(Deck deck) {
        if (decks.size() == limiteDeDecks()) {
            return false;
        }
        return decks.add(deck);
    }



}
