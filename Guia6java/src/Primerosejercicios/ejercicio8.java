package Primerosejercicios;

import java.util.Scanner;

public class ejercicio8 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int nota = 11;

        while (nota >= 10){
            System.out.println("ingrese una nota del 0 al 10");
            nota = leer.nextInt();
        }

    }
}
