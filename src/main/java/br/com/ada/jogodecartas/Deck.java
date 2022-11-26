package br.com.ada.jogodecartas;

import java.util.ArrayList;
import java.util.List;

public abstract class Deck {

    private final List<Carta> cartas;

    public Deck() {
        this.cartas = new ArrayList<>();
    }

    public abstract Integer limiteDeCartas();

    public boolean adicionarCarta(Carta carta) {
        if (cartas.size() == limiteDeCartas()) {
            return false;
        }
        return cartas.add(carta);
    }

}
