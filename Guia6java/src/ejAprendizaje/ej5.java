package ejAprendizaje;

import java.util.Scanner;

public class ej5 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int n = leer.nextInt();

        System.out.println("doble " + n * 2);
        System.out.println("triple " + n * 3);
        System.out.println("raiz cuadrada " + Math.sqrt(n));
    }
}
