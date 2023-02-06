/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author lucas
 */
public class Alquiler {
    private Cliente cliente;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private Amarre amarre;
    private Float costo;

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public Alquiler() {
    }

    public Alquiler(Cliente cliente, Date fechaAlquiler, Date fechaDevolucion, Amarre amarre, Float costo) {
        this.cliente = cliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.amarre = amarre;
        this.costo = costo;
    }

   

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Amarre getAmarre() {
        return amarre;
    }

    public void setAmarre(Amarre amarre) {
        this.amarre = amarre;
    }
    
    
    
    
}
