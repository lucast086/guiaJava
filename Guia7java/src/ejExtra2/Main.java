package ejExtra2;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Puntos puntos = new Puntos();
        generarPuntos(puntos);
        System.out.println("La distancia entre los puntos: ");
        System.out.println(puntos.toString());
        System.out.println("es "+ puntos.distanciaEntrePuntos());
    }

    public static void generarPuntos(Puntos puntos){
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE EL VALOR X DEL PUNTO 1");
        puntos.setX1(leer.nextInt());
        System.out.println("INGRESE EL VALOR Y DEL PUNTO 1");
        puntos.setY1(leer.nextInt());
        System.out.println("INGRESE EL VALOR X DEL PUNTO 2");
        puntos.setX2(leer.nextInt());
        System.out.println("INGRESE EL VALOR Y DEL PUNTO 2");
        puntos.setY2(leer.nextInt());


    }
}
