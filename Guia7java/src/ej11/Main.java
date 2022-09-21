package ej11;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main (String []args)  {
        Scanner leer = new Scanner(System.in);

        Date fechaActual = new Date();
        System.out.println("ingrese año");
        int anio = leer.nextInt();
        System.out.println("ingrese mes");
        int mes = leer.nextInt();
        System.out.println("ingrese dia");
        int dia = leer.nextInt();
        Date fecha = new Date(anio-1900,mes,dia);

        System.out.println("diferencia de años entre fecha y fecha actual "+(fecha.getYear()-fechaActual.getYear()));
    }
}
