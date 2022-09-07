package ejExtra;
/*

 */

import java.util.Scanner;

public class ej24 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese N");
        int n = leer.nextInt();
        System.out.println("Estos son los primeros "+n+" numeros de la serie de Fibonacci: ");

        for ( int a: SerieFibo(n)) {
            System.out.print(" "+a);
        }
    }

    private static int SerieFiboRec (int n){
        if (n <= 1){
            return  1;
        } else return SerieFiboRec(n-1) + SerieFiboRec(n-2);
    }

    private static int[] SerieFibo (int n){
        int [] ar = new int[n];
        int a = 0, b = 1, c = 0;

        for (int i = 0 ; i < n; i++ ){
            ar[i] = a;
            c = a+b;
            a = b;
            b = c;
        }
        return ar;
    }


}
