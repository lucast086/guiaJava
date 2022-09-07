package ejExtra;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        Integer nn = leer.nextInt();
        int count = 1;
        while (10 <= nn){
            nn = nn/10;
            count++;
        }
        System.out.println(count);

    }
}
