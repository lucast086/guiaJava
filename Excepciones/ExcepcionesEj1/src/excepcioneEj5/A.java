/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcioneEj5;

/**
 *
 * @author lucas
 */
class A {
    /*
void metodoA() {
sentencia_a1
sentencia_a2
try {
sentencia_a3
sentencia_a4
} catch (MioException e){
sentencia_a6
}
sentencia_a5
}
*/
    public static void main (String[] args){
        System.out.println("A: ");
        System.out.println("sentencia_a1 y sentencia_a2 se ejecutan por estar fuera del bloque try");
        System.out.println("***** caso1 (excepcion en sentencia_a3)");
        System.out.println("*****       sentencia_a6");
        System.out.println("*****       sentencia_a5");
        System.out.println("");
        System.out.println("***** caso2 (excepcion en sentencia_a4)");
        System.out.println("*****       sentencia_a3");
        System.out.println("*****       sentencia_a6");
        System.out.println("*****       sentencia_a5");
        System.out.println(" ");
        System.out.println("B: ");
        System.out.println("***** sentencia_a1");
        System.out.println("*****   sentencia_a2");
        System.out.println("*****     sentencia_a3");
        System.out.println("*****       sentencia_a4");
        System.out.println("*****         sentencia_a5");
    }
}
