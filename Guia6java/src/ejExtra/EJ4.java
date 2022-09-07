package ejExtra;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        do {
            System.out.println("ingrese un numero del 1 al 10");
            n = leer.nextInt();
        } while (n < 1 || n > 10);

        switch (n){
            case 1 :
                System.out.println("I");
                break;
            case 2 :
                System.out.println("II");
                break;
            case 3 :
                System.out.println("III");
                break;
            case 4 :
                System.out.println("IV");
                break;
            case 5 :
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7 :
                System.out.println("VII");
                break;
            case 8 :
                System.out.println("VIII");
                break;
            case 9 :
                System.out.println("IX");
                break;
            case 10 :
                System.out.println("X");
                break;
        }
    }
}
