package ejAprendizaje;

import java.util.Scanner;

public class ej6 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int n = leer.nextInt();

        if(n % 2 == 0){
            System.out.println("el numero es par");
        } else System.out.println("el numero es impar");
    }
}
