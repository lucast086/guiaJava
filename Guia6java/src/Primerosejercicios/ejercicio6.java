package Primerosejercicios;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2;

        System.out.println("ingrese 1 numero entero");
        n1 = leer.nextInt();
        System.out.println("ingrese 2 numero entero");
        n2 = leer.nextInt();

        if (n1 > 25){
            System.out.println("el primer numero es mayor que 25");
        } else if (n2 > 25){
            System.out.println("el segundo numero es mayor que 25");
        } else System.out.println("ningun numero es mayor a 25");
    }
}