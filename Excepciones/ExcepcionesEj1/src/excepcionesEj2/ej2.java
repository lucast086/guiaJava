/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesEj2;

/**
 *
 * @author lucas
 */
public class ej2 {

    public static void main (String[] args) {
        int[] arreglo = new int[10];

        try {
            for (int i = 0; i < 12; i++) {
                arreglo[i] = i;
            }
        } catch (RuntimeException e) {
            System.out.println("capacidad maxima del arreglo "+ e.getMessage());
            
        }
        System.out.println("TERMINO EL BLOQUE TRY");
    }
}
