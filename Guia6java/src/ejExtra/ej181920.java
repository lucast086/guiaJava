package ejExtra;

import java.util.Scanner;

public class ej181920 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese tamaño del vector");
        int n = leer.nextInt();

        //ej 18
        double[] v = new double[n];
        AddVector(v);
        System.out.println("la suma es "+SumVector(v));

        //ej19
        int[] va = new int[n];
        int[] vv = new int[n];
        AddVector(vv,10);
        AddVector(va,10);
        System.out.println("son iguales los vectores? "+IsVectorEquals(va,vv));

        //ej 20
        double[] vec = new double[n];
        AddVector(vec,100);
        ShowVector(vec);

    }
    static void AddVector(double[] ar){
        Scanner l = new Scanner(System.in);
        for (int i = 0 ; i < ar.length ; i++){
            System.out.println("Ingrese un valor para la posicion "+(i+1));
            ar[i] = l.nextDouble();
        }
    }
    static double SumVector(double[] ar){
        double suma = 0d;
        for (int i = 0 ; i < ar.length ; i++){
            suma += ar[i];
        }
        return suma;
    }
    //EJERCICIO 19
    //se supone que los vectores estan ordenados
    static void AddVector(int[] ar, int x){
        for (int i = 0 ; i < ar.length ; i++){
            ar[i] = (int)Math.round(Math.random()*x);
        }
    }
    static boolean IsVectorEquals(int[] ar, int[] br){
        if (ar.length != br.length){
            return false;
        } else {
            for (int i = 0; i < ar.length; i++){
                if (ar[i] != br[i]) return false;
            }
            return true;
        }
    }

   //EJERCICIO 20
// rellena un vector con numeros aleatorios entre 0 y x
    static void AddVector(double[] ar, int x){
        for (int i = 0 ; i < ar.length ; i++){
            ar[i] = Math.random()*x;
        }
    }
    static void ShowVector(double[] ar){
        for (int i = 0 ; i < ar.length ; i++){
            System.out.println("["+ar[i]+"]");
        }
    }

}