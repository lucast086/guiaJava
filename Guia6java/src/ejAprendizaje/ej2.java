package ejAprendizaje;

import java.util.Scanner;
import java.util.SplittableRandom;

public class ej2 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        String name ;

        System.out.println("ingresa tu nombre");
        name = leer.nextLine();
        System.out.println("tu nombre es "+name);
    }
}
