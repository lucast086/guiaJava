package ejAprendizaje;

import java.util.Scanner;

public class ej8 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase de 8 caracteres");
        String f = leer.nextLine();
        if (f.length()==8) System.out.println("correcto");
        else System.out.println("incorrecto");

    }
}
