package ejExtra;

import java.util.Scanner;

public class ej15 {

    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        int opt;
        do {
            System.out.println("ingrese un numero");
            double n1 = leer.nextDouble();
            System.out.println("ingrese otro numero");
            double n2 = leer.nextDouble();

            System.out.println(" MENU");
            System.out.println(" 1. Sumar");
            System.out.println(" 2. Restar");
            System.out.println(" 3. Multiplicar");
            System.out.println(" 4. Dividir");
            System.out.println(" 5. Salir");
            System.out.println(" Elija una opcion");
            opt = leer.nextInt();

            switch (opt){
                case 1 :
                    System.out.println("la suma es "+suma(n1,n2));
                    break;
                case 2 :
                    System.out.println("la resta es "+resta(n1,n2));
                    break;
                case 3 :
                    System.out.println("la multiplicacion es "+multiplicacion(n1,n2));
                    break;
                case 4 :
                    System.out.println("la division es "+division(n1,n2));
                    break;
                case 5 :
                    System.out.println("estas seguro que desea salir del programa S/N");
                    String o = leer.next();
                    if (o.toLowerCase().equals("s")) System.out.println("Adios");
                    else opt = 0;
            }
        } while (opt != 5);


    }
    static double suma (double a, double b){
        return a+b;
    }
    static double resta (double a, double b){
        return a-b;
    }
    static double multiplicacion (double a, double b){
        return a*b;
    }
    static double division (double a, double b){
        return a/b;
    }
}
