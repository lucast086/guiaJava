/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Piso {
    
    private int numero;
    private ArrayList<Oficina> oficinas;

    public Piso() {
    }

    public Piso(int numero, ArrayList<Oficina> oficinas) {
        this.numero = numero;
        this.oficinas = oficinas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    public ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(ArrayList<Oficina> oficinas) {
        this.oficinas = oficinas;
    }

    @Override
    public String toString() {
        return "Piso "+ numero + "{  oficinas=" + oficinas + '}';
    }
    
    
}
