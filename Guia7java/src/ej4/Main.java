package ej4;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese base");
        double b = leer.nextDouble();
        System.out.println("ingrese altura");
        double h = leer.nextDouble();
        Rectangulo r = new Rectangulo(b,h);

        System.out.println("ALTURA "+r.getAltura());
        System.out.println("BASE "+r.getBase());
        System.out.println("PERIMETRO "+r.perimetro());
        System.out.println("SUPERFICIE "+r.superficie());
        System.out.println("DIBUJO ");
        r.draw();

    }

}
