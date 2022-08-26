package Primerosejercicios;

import java.util.Scanner;

public class ejercicio9 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int numero, i;
        i = 1;
        do {
            System.out.println("ingrese un numero");
            numero = leer.nextInt();
            i++;
        } while (numero != 0 && i <20);
        if (numero == 0) {
            System.out.println("Se capturo el numero 0");
        } else System.out.println("numero maximo de intentos");
    }
}
