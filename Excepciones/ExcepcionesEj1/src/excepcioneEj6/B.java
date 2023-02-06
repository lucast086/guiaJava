/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcioneEj6;

/**
 *
 * @author lucas
 */
public class B {
     public static void main (String[] args){
        System.out.println("A: ");
        System.out.println("sentencia_b1 se ejecuta por estar fuera del bloque try");
         System.out.println("sentencia_b2 SE PRODUCE EXCEPCION");
        System.out.println("***** sentencia_b3   porque se produjo el error");
        System.out.println("*****   sentencia_b4   porque el bloque finally se ejecuta siempre");
        System.out.println(" ");
        System.out.println("B: ");
        System.out.println("***** sentencia_b1");
        System.out.println("*****   sentencia_b2");
        System.out.println("*****   sentencia_b4   porque el bloque finally se ejecuta siempre");

    }
}
