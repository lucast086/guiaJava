package ej2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Circunferencia cir = crearCircunferencia();
        System.out.println("area "+cir.area());
        System.out.println("perimetro "+cir.perimetro());
    }
    public static Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la nueva circunferncia");
        return new Circunferencia(leer.nextDouble());

    }
}
