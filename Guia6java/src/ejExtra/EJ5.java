package ejExtra;

import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double descA = 0.5, descB = 0.65;
        System.out.println("INGRESE LA CLASE DE SOCIO -A -B -C");
        String c = leer.next().substring(0,1).toUpperCase();
        System.out.println("INGRESE VALOR DEL TRATAMIENTO");
        double v = leer.nextDouble();

        switch (c) {
            case "A" :
                System.out.println("SOCIO CLASE A - DESC APLICADO 50% - VALOR FINAL DEL TRATAMIENTO: $ "+v*descA);
                break;
            case "B" :
                System.out.println("SOCIO CLASE B - DESC APLICADO 35% - VALOR FINAL DEL TRATAMIENTO: $ "+v*descB);
                break;
            case "C" :
                System.out.println("SOCIO CLASE C - SIN DESCUENTO - VALOR FINAL DEL TRATAMIENTO: $ "+v);
                break;
            default:
                System.out.println("CATEGORIA DE SOCIO NO VALIDA");
        }
    }
}
