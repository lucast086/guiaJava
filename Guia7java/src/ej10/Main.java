package ej10;

import java.util.Arrays;

public class Main {
    public static void main (String[]args)  {
        double[] A = new double[50];
        double[] B;
        double val1 = 1.0D;
        double val2 = 100D;

        for (int i = 0 ; i < A.length ; i++){
            A[i] = (Math.random()*100);
        }

        System.out.println("ARREGLO A LLENO: ");
        System.out.println(Arrays.toString(A));

        Arrays.sort(A);
        B = Arrays.copyOfRange(A,0,19);
        Arrays.fill(B,10,19,0.5);
        System.out.println("ARREGLO A ORDENADO: ");
        System.out.println(Arrays.toString(A));
        System.out.println("ARREGLO B LLENO: ");
        System.out.println(Arrays.toString(B));
    }
}
