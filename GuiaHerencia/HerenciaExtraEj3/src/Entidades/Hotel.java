/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author lucas
 */
public abstract class Hotel extends Alojamiento {
    private int cantHabitaciones;
    private int numCamas;
    private int cantPisos;
    private float precioHabitacion;

    /*
    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int numCamas, int cantPisos,float precioHabitacion ,String nombre, String direccion, String localidad, String gerenteEncargado) {
        super(nombre, direccion, localidad, gerenteEncargado);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }
*/

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public float getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(float precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

   /* public abstract float precioHabitacion();
*/
    
    @Override
    public String toString() {
        return "Hotel{" + "cantHabitaciones=" + cantHabitaciones + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHabitacion=" + precioHabitacion + '}';
    }
    
    
    
    
}
