package ejExtra;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la altura de la escalera");
        int a = leer.nextInt();
        for (int i = 1 ; i <= a ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
