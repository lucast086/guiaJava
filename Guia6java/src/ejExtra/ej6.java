package ejExtra;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("cantidad de personas a ingresar");
        int cant=0, n = leer.nextInt();
        double a, promGral =0, promEst= 0;
        for (int i = 1; i <= n; i++){
            System.out.println("ingrese altura de la persona "+i);
            a = leer.nextDouble();
            promGral+= a;
            if (a < 1.60) {
                promEst+= a;
                cant++;
            }
        }
        System.out.println("Promedio general de estatura: "+promGral/n+" Mts");
        System.out.println("Promedio de estaruas menores que 1.60 mts: "+promEst/cant+" Mts");

    }
}
