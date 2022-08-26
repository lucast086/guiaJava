package Primerosejercicios;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class ejercicio13y14 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[7];

        for (int i = 0; i < Equipo.length;i++){
            System.out.println("ingrese del compañero n° "+(i+1)+" de un total de "+Equipo.length );
            Equipo[i] = leer.nextLine();
        }

    }
}
