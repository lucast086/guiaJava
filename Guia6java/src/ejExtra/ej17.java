package ejExtra;

import java.util.Scanner;

public class ej17 {
    public static void main (String[] args){
            Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
            int opt = leer.nextInt();
        System.out.println("es primo: "+ Isprimo(opt));
    }

    private static boolean Isprimo(int a) {
        int count = 0;
        for (int i = 1 ; i <= a ; i++){
            if (a%i == 0) count++;
        }
        if (count > 2) return false;
        else return true;
    }

}
