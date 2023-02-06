/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class excepcionesEj8 {
    public static void main(String[] args) {
        
        System.out.println("");
        System.out.println("CLASS C");
        System.out.println("A: ");
        System.out.println("sentencia_c1 ");
        System.out.println("caso1  sentencia_c2 (exepcion en c3)");
        System.out.println("caso2  (exepcion en c2)");
        System.out.println("sentencia_c4 ");
        System.out.println("sentencia_c6 ");
        System.out.println("");
        System.out.println("B:   supongo que tampoco se produce TuExcepcion");
        System.out.println("sentencia_c1 ");
        System.out.println("sentencia_c2 ");
        System.out.println("sentencia_c3 ");
        System.out.println("sentencia_c6 ");
        System.out.println("");
        System.out.println("C:   ");
        System.out.println("sentencia_c1 ");
        System.out.println("caso1  sentencia_c2 ( cuando la exepcion es en c3)");
        System.out.println("caso2  *NADA*  (exepcion en c2)");
        System.out.println("sentencia_c5");
        System.out.println("el finally no se imprime porque la exscepcion es arrojada para que la trate otro metodo ");
        
    }
}
