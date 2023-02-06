/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author lucas
 */
public class ExtraHotel extends Alojamiento {
    private boolean privado;
    private long mt2;

    public ExtraHotel() {
    }

    public ExtraHotel(boolean privado, long mt2, String nombre, String direccion, String localidad, String gerenteEncargado) {
        super(nombre, direccion, localidad, gerenteEncargado);
        this.privado = privado;
        this.mt2 = mt2;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public long getMt2() {
        return mt2;
    }

    public void setMt2(long mt2) {
        this.mt2 = mt2;
    }
    
    
    
}
