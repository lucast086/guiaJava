package ejAprendizaje;

import java.util.Scanner;

public class ej4 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese su temperatura en grados centigrados");
        int c = leer.nextInt();
        int f = 32+(9*c/5);
        System.out.println("temperatura en c "+c+" temperatura en F "+f);
    }
}
