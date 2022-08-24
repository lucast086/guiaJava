package Primerosejercicios;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        boolean lindo;
        double edad;
        char inicial;

        System.out.println("INGRESA LOS VALORES");
        edad = leer.nextDouble();
        System.out.println("INGRESA LOS VALORES");
        inicial = leer.next().charAt(0);
        System.out.println("INGRESA LOS VALORES");
        lindo = leer.nextBoolean();



        //correccion de errores
        //falta el System.in al instanciar scanner
        //intenta asignar un entero a una variable de tipo String
        // el mismo error que arriba pero al reves.

    }
}
