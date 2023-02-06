/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesEj4;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class AdivinaAdivinador {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero = (int) ((Math.random() * 500) + 1);
        int counter = 0;
        int opt = 0;
        System.out.println("x"+numero);
        do {
            try {
                System.out.println("ADIVINE EL NUMERO: ");
                counter++;
                opt = Integer.parseInt(leer.nextLine());
                
                
            } catch (RuntimeException re) {
                System.out.println("ERROR_: SOLAMENTE PUEDE INGRESAR NUMEROS");
            }
        } while (opt != numero);
        if (opt == numero) System.out.println("GANASTE EN "+counter+" INTENTOS");
        
    }

}
