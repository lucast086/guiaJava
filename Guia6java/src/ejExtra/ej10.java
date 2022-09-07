package ejExtra;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        long num = Math.round(Math.random()*10) * Math.round(Math.random()*10);
        while (true) {
            System.out.println("Adivine el numero del 0 al 10");
            long x = leer.nextLong();
            if (x == num) {
                System.out.println("ADIVINASTE");
                break;
            } else System.out.println("INTENTA DE NUEVO");
        }
    }
}
