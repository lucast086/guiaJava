package ejExtra;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("cantidad de numeros a ingresar? ");
        int n = leer.nextInt();
        ejDo(n);
        ejWhile(n);

    }
    static void ejDo(int n){
        Scanner leer = new Scanner(System.in);
        int i = 0;
        double x, max = -1, min = 999999, prom = 0;
        do{
            System.out.println("ingrese el valor del numero mayor que 0");
            x = leer.nextDouble();
            if (x > max) max = x;
            if (x < min) min = x;
            prom +=x;
            i++;
        } while (i < n);

        System.out.println("maximo "+max);
        System.out.println("minimo "+min);
        System.out.println("promedio "+prom/n);
    }
    static void ejWhile(int n){
        Scanner leer = new Scanner(System.in);
        int i = 0;
        double x, max = -1, min = 999999, prom = 0;

        while(i < n) {
            System.out.println("ingrese el valor del numero mayor que 0");
            x = leer.nextDouble();
            if (x > max) max = x;
            if (x < min) min = x;
            prom += x;
            i++;
        }
        System.out.println("maximo "+max);
        System.out.println("minimo "+min);
        System.out.println("promedio "+prom/n);
    }
}
