package Primerosejercicios;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tipoMotor;

        System.out.println("ingrese un tipo de motor del 1 al 4");
        tipoMotor = leer.nextInt();

        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de alimenticia");
                break;
            default: System.out.println("No existe un valor valido para tipo de bomba");
        }

    }
}