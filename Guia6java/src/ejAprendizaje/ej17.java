package ejAprendizaje;

import java.util.Random;
import java.util.Vector;

public class ej17 {
    public static void main (String[] args){
        int d1=0,d2=0,d3=0,d4=0,d5=0, n = 100;
        Integer[] arr = new Integer[n];
        Random r = new Random();

        //relleno el arreglo con numero enteros aleatorios entre 0 y 99999
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = r.nextInt(99999);
            //arr[i] = Math.toIntExact(Math.round(Math.random() * (99999) + 1));  // Valor entre M y N, ambos incluidos.

        }
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }

        //contabilizo los numeros
        for (Integer a: arr) {
            switch (a.toString().length()) {
                case 1 : d1++;
                break;
                case 2 : d2++;
                break;
                case 3 : d3++;
                break;
                case 4 : d4++;
                break;
                case 5 : d5++;
                break;
            }
        }
        System.out.println("NUMEROS CON 1 DIGITO: "+d1);
        System.out.println("NUMEROS CON 2 DIGITO: "+d2);
        System.out.println("NUMEROS CON 3 DIGITO: "+d3);
        System.out.println("NUMEROS CON 4 DIGITO: "+d4);
        System.out.println("NUMEROS CON 5 DIGITO: "+d5);

    }
}
