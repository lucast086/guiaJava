/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaextraej1;

import Entidades.Alquiler;
import Entidades.BarcoAmotor;
import Entidades.Cliente;
import Entidades.Puerto;
import Servicios.Servicios;
import java.util.ArrayList;

/**
 * clase padre Barco
 * clase hijo velero - BarcoAmotor - YateDeLujo
 *  clase puerto 
 * clase alquiler (cliente, fehca alquiler, fecha devolucion, amarre, barco
 * clase amarre (ubicacion, tipo de barco que puede amarrar, disponible)
 * clase cliente hereda de persona y agrega n cliente, barcos que posee.
 * clase persona (nombre,apellido,edad,dni)
 * clase menu
 * clase servicios.
 * 
 * 
 * En un puerto se alquilan amarres para barcos de distinto tipo. 
 * Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, 
* la posición del amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
* 
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
* 
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
* 
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 * @author lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Servicios servicio = new Servicios();
        
        Puerto puertoMon = servicio.crearPuerto();
        ArrayList<Cliente> clientes = servicio.crearClientes();
 
        
        //ME QUEDE ACA FALTA INICIAR LA SIMULACION
        System.out.println("clientes"+clientes.toString());
        
        for (int i = 0; i < clientes.size()-8; i++) {
            Cliente cliente = clientes.get(i);
            servicio.crearAlquiler(puertoMon, cliente);
            
        }
        
        for (int i = 0; i < clientes.size()-8; i++) {
            Cliente cliente = clientes.get(i);
            System.out.println("pago?"+ servicio.pagarAlquiler(cliente));
            
        }
        
    }
    /*
    creacion de puerto.
    creacion de clientes, 
    lista de alquileres.
    
    simular clientes que van al puerto.
    
    
    generacion de puerto y de amarres para simulacion
    
    
    */
}
