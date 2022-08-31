package ejAprendizaje;

import java.util.Scanner;

public class ej3 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingresa una frase");
        String frase = leer.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
    }
}
