/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaextraej3;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel4star;
import Entidades.Hotel5star;
import Entidades.Residencia;
import Enums.Gimnasio;
import Servicios.ServicioHotel;
import java.util.ArrayList;

/**
 * un metodo que cree una lista de alojamientos para usar de simulacion del
 * programa.
 *
 * @author lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<Alojamiento> lista = new ArrayList<>();
        ServicioHotel servicio = new ServicioHotel();

        Camping camping = new Camping(5, 3, true, true, 6, "la bajada22", "direccion22", "localidad22", "gerenteEncargado22");
        lista.add(camping);
        Camping camping2 = new Camping(3, 2, false, true, 6, "pelicano44", "direccion44", "localidad44", "gerenteEncargado44");
        lista.add(camping2);
        Hotel4star h1 = new Hotel4star("El Chori Loco", 40, Gimnasio.A, 50, 70, 3, "Hotelo", "Oscuridad 69", "chita", "george de la selva");
        servicio.precioHabitacion(h1);
        lista.add(h1);
        Hotel4star h2 = new Hotel4star("Que se Come", 80, Gimnasio.B, 40, 45, 2, "El Sinestrellas", "Juan V. Poco 111", "Chapanay", "carlos alberto");
        servicio.precioHabitacion(h2);
        lista.add(h2);
        Hotel5star h3 = new Hotel5star(1, 5, 2, "El Salpicon", 80, Gimnasio.A, 100, 150, 6, "MejorSolo", "Juan D. Perron 450", "Ugarteche", "santos aguirre");
        servicio.precioHabitacion(h3);
        lista.add(h3);
        Hotel5star h4 = new Hotel5star(2, 15, 5, "Puchero's", 50, Gimnasio.B, 80, 90, 20, "El Descanso", "Parque Chachingo", "Maipu", "casimiro");
        servicio.precioHabitacion(h4);
        lista.add(h4);
        Camping h5 = new Camping(120, 3, true, false, 2000, "El Resbalon", "Lamatriz 574", "Colonia Bombal", "Mary Conazo");
        lista.add(h5);
        Camping h6 = new Camping(150, 4, false, false, 2500, "Carrizal de Abajo", "El pejerrey 54", "Carrizal", "Elba Gallo");
        lista.add(h6);
        Residencia h7 = new Residencia(10, false, true, true, 200, "La Posada de Cacho", "Av. Corrientes 45", "Bs As", "Juan DeLospalotes");
        lista.add(h7);
        Residencia h8 = new Residencia(15, true, true, false, 250, "Engañao", "Ituzaingo 78", "Mendoza", "Jose Cuernos");
        lista.add(h8);

        
        servicio.menu(lista);
    
    }

}
