/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesEj3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class DivisionNumero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        try {
            System.out.println("INGRESE NUM 1");
            int n1 = Integer.parseInt(leer.nextLine());
            System.out.println("INGRESE NUM 2");
            int n2 = Integer.parseInt(leer.nextLine());
            
            int a = n1 / n2;
            System.out.println("resultado division "+ a);
        } catch (ArithmeticException ae) {
            System.out.println("Error Aritmetico");
            }
        catch (InputMismatchException ie) {
            System.out.println("Error en el ingreso de datos");
        }
        catch (NumberFormatException ne) {
            System.out.println("Error en  el formato del numero");
        }
        System.out.println("TERMINO EL BLOQUE TRY");
    }
}
