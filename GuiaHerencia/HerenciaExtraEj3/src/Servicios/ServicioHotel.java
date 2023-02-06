/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel;
import Entidades.Hotel4star;
import Entidades.Hotel5star;
import Entidades.Residencia;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ServicioHotel {

    /*
     
     metodo que calcula el precio de la habitacion (se ven los valores agregados)  ---
    
    metodo menu que dirija el transito 
    metodos filtro:   filtroXalojamiento (devuelve una lista de alojamientos)  || 
                    filtroXresidenciaConDesc
                    filtroXcampingConResto
                    filtroxHoteles
    
    metodo ordenarHotelesXprecio.
    
    
     */
   
public float precioHabitacion(Hotel h) {
        int precioBase = 50;
        int precioFinal = h.getCantHabitaciones();
        
        if (h instanceof Hotel4star hotel1)
         precioFinal+= precioBase + valorAgregadoXresto(hotel1) +
                                    valorAgregadoXgym(hotel1);
        else if (h instanceof Hotel5star hotel2) precioFinal+= precioBase + 
                                                 valorAgregadoXresto(hotel2) +
                                                 valorAgregadoXgym(hotel2) + 
                                                 valorAgregadoXlimosina(hotel2);
        
        h.setPrecioHabitacion(precioFinal);
        return precioFinal;
    }
    
     private float valorAgregadoXresto(Hotel4star h) {
        float precio = 0;

        
        if (h.getCapcidadRestaurante() > 50) {
            precio += 50;
        } else if (h.getCapcidadRestaurante() > 29) {
            precio += 30;
        } else {
            precio += 10;
        }

        return precio;
    }

    private float valorAgregadoXgym(Hotel4star h) {
        float precio = 0;

        if (h.getGym().getTipo().equalsIgnoreCase("A")) {
            precio += 50;
        } else precio += 30;

        return precio;
    }
       private float valorAgregadoXlimosina(Hotel5star h) {
        int valorXlimo = 15;
        return h.getCantLimosinas() * valorXlimo;
    }
    
    public void menu(ArrayList<Alojamiento> lista){
        Scanner leer = new Scanner(System.in);
        
        int opt = 0;
        do {
            System.out.println("");
            System.out.println("******   ALOJAMIENTOS   ******");
            System.out.println("* 1. Todos los Alojamientos  *");
            System.out.println("* 2. Hoteles por precio      *");
            System.out.println("* 3. Campings c/restorant    *");
            System.out.println("* 4. Residencias c/descuento *");
            System.out.println("* 5. Salir                   *");
            System.out.println("******************************");
            System.out.println("Selecciona una opcion");
            opt = leer.nextInt();

            switch (opt) {
                case 1:
                    filtroXalojamiento(lista);
                    break;
                case 2:
                    filtroXprecioHotel(lista);
                    break;
                case 3:
                    filtroXcampingResto(lista);
                    break;
                case 4:
                    filtroXresidenciaDesc(lista);
                    break;
                case 5:
                    System.out.println("SALIENDO!!!");
                    break;
                default:
                    System.out.println("Ingreso una opcion no valida");
            }
            
            
        } while (opt != 5);
        
    }
    
    public void filtroXalojamiento(ArrayList<Alojamiento> alojamientos){
        alojamientos.forEach(System.out::println);
        
    }
    
    public void filtroXprecioHotel(ArrayList<Alojamiento> alojamientos){
        
         ArrayList<Hotel> list = new ArrayList<>();
        alojamientos.stream().filter(aloja -> (aloja instanceof Hotel) )
                .forEach(c -> list.add((Hotel) c));
        
        list.stream().sorted(Comparator.comparing(Hotel::getPrecioHabitacion)
        .reversed())
                .forEach(System.out::println);
                
        
    }
    public void filtroXcampingResto(ArrayList<Alojamiento> alojamientos){
        
        ArrayList<Camping> list = new ArrayList<>();
        
        alojamientos.stream().filter(aloja -> (aloja instanceof Camping c) )
                        .forEach(c -> list.add((Camping) c));
        
        list.stream().filter(c -> c.isTieneResto()).forEach(System.out::println);
            
    }
    public void filtroXresidenciaDesc(ArrayList<Alojamiento> alojamientos){
        ArrayList<Residencia> list = new ArrayList<>();
        
        alojamientos.stream().filter(aloja -> (aloja instanceof Residencia c) )
                        .forEach(c -> list.add((Residencia) c));
        
        list.stream().filter(c -> c.isHaceDescuentoGremio()).forEach(System.out::println);
    }
    
    
       
}
