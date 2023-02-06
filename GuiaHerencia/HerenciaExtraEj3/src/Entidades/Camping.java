/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author lucas
 */
public class Camping extends ExtraHotel {
    private int capMaxCarpas;
    private int cantBaños;
    private boolean tieneResto;

    public Camping() {
    }

    public Camping(int capMaxCarpas, int cantBaños, boolean tieneResto, boolean privado, long mt2, String nombre, String direccion, String localidad, String gerenteEncargado) {
        super(privado, mt2, nombre, direccion, localidad, gerenteEncargado);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBaños = cantBaños;
        this.tieneResto = tieneResto;
    }

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getCantBaños() {
        return cantBaños;
    }

    public void setCantBaños(int cantBaños) {
        this.cantBaños = cantBaños;
    }

    public boolean isTieneResto() {
        return tieneResto;
    }

    public void setTieneResto(boolean tieneResto) {
        this.tieneResto = tieneResto;
    }

    @Override
    public String toString() {
        return "CAMPING { " + "capMaxCarpas= " + capMaxCarpas + 
                ", cantBaños= " + cantBaños + 
                ", tieneResto = " + tieneResto + " }";
    }
    
    
    
}
