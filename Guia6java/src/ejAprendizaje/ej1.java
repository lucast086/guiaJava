package ejAprendizaje;

import java.util.Scanner;

public class ej1 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int n1,n2;

        System.out.println("ingrese el primer numero");
        n1 = leer.nextInt();
        System.out.println("ingrese el segundo numero");
        n2 = leer.nextInt();
        int suma = n1 + n2;
        System.out.println("la suma de "+n1+" y de "+n2+" es "+suma);

    }
}
