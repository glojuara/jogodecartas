package br.com.ada;

import br.com.ada.jogodecartas.Deck;
import br.com.ada.jogodecartas.Tabuleiro;
import br.com.ada.jogodecartas.factory.GameFactory;
import br.com.ada.jogodecartas.factory.TeamGameFactory;

public class Main {

    public static void main(String[] args) {

        /*
        TabuleiroVersus tabuleiroVersus = new TabuleiroVersus();
        DeckVersus deckVersus = new DeckVersus();
        DeckParty deckParty = new DeckParty();

        tabuleiroVersus.adicionarDeck(deckVersus);
        tabuleiroVersus.adicionarDeck(deckParty);
         */

        GameFactory gameFactory = new TeamGameFactory();
        Tabuleiro tabuleiro = gameFactory.criarTabuleiro();
        Deck deck = gameFactory.criarDeck();
        tabuleiro.adicionarDeck(deck);

        System.out.println(tabuleiro.limiteDeDecks());
        System.out.println(deck.limiteDeCartas());
    }

}