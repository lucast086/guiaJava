package ejAprendizaje;

import java.util.Scanner;

public class ej9 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String f = leer.nextLine();
        if (f.startsWith("A")) System.out.println("CORRECTO");
        else System.out.println("INCORRECTO");
    }
}
