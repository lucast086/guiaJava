package ejAprendizaje;

import java.util.Scanner;

public class ej7 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese una frase");
        String s = leer.next();
        if (s.equals("eureka")) System.out.println("CORRECTO");
        else System.out.println("incorrecto");
    }
}
