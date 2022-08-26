package Primerosejercicios;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class ejercicio10 {
    public static void main (String[] args){
        int n1,n2,n3,n4;
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el primer numero del 1 al 20");
        n1 = leer.nextInt();
        System.out.println("ingrese el primer numero del 1 al 20");
        n2 = leer.nextInt();
        System.out.println("ingrese el primer numero del 1 al 20");
        n3 = leer.nextInt();
        System.out.println("ingrese el primer numero del 1 al 20");
        n4 = leer.nextInt();

        System.out.print(n1);
        for (int i = 0; i < n1; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(n2);
        for (int i = 0; i < n2; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(n3);
        for (int i = 0; i < n3; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(n4);
        for (int i = 0; i < n4; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
