package Primerosejercicios;

import java.util.Scanner;

public class ejercicio12 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el primer entero");
        int n1 = leer.nextInt();
        System.out.println("ingrese el segundo entero");
        int n2 = leer.nextInt();
        EsMultiplo(n1,n2);
    }
    private static void EsMultiplo(int a, int b){
        if (a % b == 0){
            System.out.println("el numero "+a+" es multiplo del numero "+b);
        } else System.out.println("el numero "+a+" es multiplo del numero "+b);
    }

}
