package Ej3.Entidades;

import java.util.LinkedList;
import java.util.List;

public class Baraja {
    LinkedList<Carta> cartas;

    public Baraja() {
    }

    public Baraja(LinkedList<Carta> cartas) {
        this.cartas = cartas;
    }

    public LinkedList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(LinkedList<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "cartas=" + cartas +
                '}';
    }
}
