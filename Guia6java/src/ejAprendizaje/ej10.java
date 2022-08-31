package ejAprendizaje;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero limite");
        int limite = leer.nextInt();

        int n = 0;
        do {
            System.out.println("ingrese otro numero");
            n +=leer.nextInt();
        } while (n <= limite);
        System.out.println("limite alcanzado");
    }
}