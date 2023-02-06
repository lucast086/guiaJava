/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author lucas
 */
public class Alojamiento {
    // algunos atributos deberian representarse con clases pero para el ejmplo basta con esta representacion
    private String nombre;
    private String direccion;
    private String localidad;
    private String gerenteEncargado;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerenteEncargado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerenteEncargado = gerenteEncargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerenteEncargado() {
        return gerenteEncargado;
    }

    public void setGerenteEncargado(String gerenteEncargado) {
        this.gerenteEncargado = gerenteEncargado;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerenteEncargado=" + gerenteEncargado + '}';
    }
    
    
    
}
