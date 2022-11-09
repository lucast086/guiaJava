package Ej3.Entidades;

import Ej3.enums.NumCarta;
import Ej3.enums.Palo;

public class Carta {

    private Palo palo;
    private NumCarta num;

    public Carta(Palo palo, NumCarta num) {
        this.palo = palo;
        this.num = num;
    }

    public Carta() {
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public NumCarta getNum() {
        return num;
    }

    public void setNum(NumCarta num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Carta{" +
                palo +
                "," + num +
                '}';
    }
}