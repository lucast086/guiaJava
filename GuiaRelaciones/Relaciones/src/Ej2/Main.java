package Ej2;

import Ej2.Entidades.Juego;
import Ej2.Entidades.Jugador;
import Ej2.Entidades.Revolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("RULETA RUSA");
        Juego juego = new Juego();

        System.out.println("INGRESE LA CANTIDAD DE JUGADORES");
        int cantJugadores = leer.nextInt();

        List<Jugador> jugadores = new ArrayList<>(cantJugadores);
        for (int i = 0 ; i < cantJugadores;i++){
            String nombre = "Jugador "+(i+1);
            jugadores.add(new Jugador((i+1),nombre,false));
        }
        juego.setJugadores(jugadores);
        System.out.println("JUGADORES CARGADOS");

        System.out.println("CARGANDO REVOLVER");
        Revolver revolver = new Revolver();
        revolver.llenarRevolver();
        juego.setRevolverDeAgua(revolver);

        System.out.println("CONTROL DE AGUAS");
        System.out.println("pos agua"+ revolver.getPosicionAgua());
        System.out.println("pos act"+ revolver.getPosicionActual());

        System.out.println("INICIO DEL JUEGO");

        System.out.println("SORTEO DE TURNO");
        int turno = (int) (Math.random()* cantJugadores +1) ;
        boolean juegoSigue;
        do {
            System.out.println("ES TURNO DEL JUGADOR "+turno);
            juegoSigue = juego.ronda(turno-1);
            if (juegoSigue) System.out.println("EL JUGADOR " + turno + " ESTA SECO ");
            else System.out.println("EL JUGADOR " + turno + " ESTA MOJADO ");

            if (turno == cantJugadores) turno = 1;
            else turno++;

        } while (juegoSigue);


    }

}
