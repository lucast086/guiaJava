package ejAprendizaje;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class ej16 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el tamaño del vecto");
        int n = leer.nextInt();

        Vector v = new Vector<>(n);
        Random r = new Random();
        for (int i = 0 ; i < v.capacity() ; i++){
            v.add(r.nextInt(2));
        }
        for (int i = 0 ; i < v.capacity() ; i++){
            System.out.println(v.get(i));
        }
        System.out.println("ingrese un entero a buscar");
        int x = leer.nextInt();

        int p=0, count =0;
        for( int i = 0 ; i < v.capacity() ; i++) {
            p = (int) v.get(i);
            if (p == x) count++;
        }
        switch (count){
            case 0 :
                System.out.println("numero no encontrado");
                break;
            case 1 :
                System.out.println("el numero " + x + " se encuentra en la posicion " + p);
                break;
            default:
                System.out.println("el numero " + x + " se encuentra en la posicion " + p+" se repite "+count+" veces");
        }
    }
}
