package br.com.ada.jogodecartas.factory;

import br.com.ada.jogodecartas.Deck;
import br.com.ada.jogodecartas.Tabuleiro;

public interface GameFactory {

    Tabuleiro criarTabuleiro();
    Deck criarDeck();

}
