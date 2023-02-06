/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesej1;

/**
 *
 * @author lucas
 */
public class ExcepcionesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona persona = null;

        try {
            persona.esMayorDeEdad();
        } catch (Exception e) {
                System.out.println("MENSAJE DE EXCEPCION "+ e.getMessage());
        }

        
      
        
    }
    
}
