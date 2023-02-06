/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author lucas
 */
public class Oficina {
    private int cantPersonas;
    private int numero;

    public Oficina() {
    }

    public Oficina(int cantPersonas, int numero) {
        this.cantPersonas = cantPersonas;
        this.numero = numero;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Oficina{" + "cantPersonas=" + cantPersonas + ", numero=" + numero + '}';
    }
    
    
    
}
