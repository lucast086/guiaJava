/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author lucas
 */
public class Residencia extends ExtraHotel {
    private int cantHabitaciones;
    private boolean haceDescuentoGremio;
    private boolean tieneCampoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean haceDescuentoGremio, boolean tieneCampoDeportivo, boolean privado, long mt2, String nombre, String direccion, String localidad, String gerenteEncargado) {
        super(privado, mt2, nombre, direccion, localidad, gerenteEncargado);
        this.cantHabitaciones = cantHabitaciones;
        this.haceDescuentoGremio = haceDescuentoGremio;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isHaceDescuentoGremio() {
        return haceDescuentoGremio;
    }

    public void setHaceDescuentoGremio(boolean haceDescuentoGremio) {
        this.haceDescuentoGremio = haceDescuentoGremio;
    }

    public boolean isTieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }

    public void setTieneCampoDeportivo(boolean tieneCampoDeportivo) {
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    @Override
    public String toString() {
        return "RESIDENCIA {" + "cantHabitaciones= " + cantHabitaciones +
                ", haceDescuentoGremio= " + haceDescuentoGremio + 
                ", tieneCampoDeportivo= " + tieneCampoDeportivo + " }";
    }
    
    
    
}
