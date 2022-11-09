package Ej2.Entidades;

import java.util.List;

public class Juego {
    Revolver revolverDeAgua;
    List<Jugador> jugadores;

    public Juego(Revolver revolverDeAgua, List<Jugador> jugadores) {
        this.revolverDeAgua = revolverDeAgua;
        this.jugadores = jugadores;
    }

    public Juego() {
    }

    public Revolver getRevolverDeAgua() {
        return revolverDeAgua;
    }

    public void setRevolverDeAgua(Revolver revolverDeAgua) {
        this.revolverDeAgua = revolverDeAgua;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public boolean ronda(int i){ //se pasa la posicion del jugador que juega la ronda
        //la ronda consta de 1 jugador 1 disparo.
        //retorna false si el jugador fue mojado.

        jugadores.get(i).disparo(revolverDeAgua);
        return !jugadores.get(i).isMojado();

    }

}
