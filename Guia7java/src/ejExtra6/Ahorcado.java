package ejExtra6;

import java.util.Arrays;

/*
voy a generar un numero de jugadas maximas que puede ser configuradas a travez de un menu configuracion
la palabra a encontrar va a ser elegida de manera aleatoria entre un grupo de palabras que posee el programa

clase Ahorcado
se va a enccargar de la iteraccion con el usuario la creacion de un nuevo juego.
la configuracion del juego
el dibujo del juego

 */
public class Ahorcado {
    private String[] palabra;
    private int encontradas = 0;
    private int turnos = 0;
    private int jugadasMaximas;

    public Ahorcado(String[] palabra, int jugadasMaximas) {
        this.palabra = palabra;
        this.jugadasMaximas = jugadasMaximas;
    }

    public Ahorcado() {
    }

    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }

    public int longitud(){
        return palabra.length;
    }
    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" +
                "palabra= " + Arrays.toString(palabra) +
                ", encontradas= " + encontradas +
                ", turnos= " + turnos +
                ", jugadasMaximas= " + jugadasMaximas +
                '}';
    }
}
