/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enums.Gimnasio;

/**
 *
 * @author lucas
 */
public class Hotel4star extends Hotel {
    
    private String restaurante;
    private int capcidadRestaurante;
    private Gimnasio gym;

    public Hotel4star() {
        
    }

    public Hotel4star(String restaurante, int capcidadRestaurante, Gimnasio gym, int cantHabitaciones, int numCamas, int cantPisos, String nombre, String direccion, String localidad, String gerenteEncargado) {
      //  super(cantHabitaciones, numCamas, cantPisos, precioHabitacion(), nombre, direccion, localidad, gerenteEncargado);
        super.setCantHabitaciones(cantHabitaciones);
        super.setCantPisos(cantPisos);
        super.setNumCamas(numCamas);
        //super.setPrecioHabitacion(precioHabitacion);
        this.restaurante = restaurante;
        this.capcidadRestaurante = capcidadRestaurante;
        this.gym = gym;
    }

  

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public int getCapcidadRestaurante() {
        return capcidadRestaurante;
    }

    public void setCapcidadRestaurante(int capcidadRestaurante) {
        this.capcidadRestaurante = capcidadRestaurante;
    }

    public Gimnasio getGym() {
        return gym;
    }

    public void setGym(Gimnasio gym) {
        this.gym = gym;
    }
/*
    @Override
    public float precioHabitacion() {
        int precioBase = 50;
        return precioBase + valorAgregadoXresto() +
                valorAgregadoXgym();
    }
    
     private float valorAgregadoXresto( ) {
        float precio = 0;

        
        if (this.capcidadRestaurante > 50) {
            precio += 50;
        } else if (this.capcidadRestaurante > 29) {
            precio += 30;
        } else {
            precio += 10;
        }

        return precio;
    }

    private float valorAgregadoXgym() {
        float precio = 0;

        if (this.gym.getTipo().equalsIgnoreCase("A")) {
            precio += 50;
        } else precio += 30;

        return precio;
    }
*/
    @Override
    public String toString() {
        return "Hotel4star{" + super.toString() + "restaurante=" + restaurante + ", capcidadRestaurante=" + capcidadRestaurante + ", gym=" + gym + '}';
    }
    
    
    
}
