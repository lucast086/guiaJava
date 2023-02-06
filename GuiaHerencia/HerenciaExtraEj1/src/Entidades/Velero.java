/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enums.TipoDeBarco;
import java.util.Date;

/**
 *
 * @author lucas
 */
public class Velero extends Barco {
    private int numMastiles;

    public Velero() {
     
    }

    public Velero(int numMastiles, int matricula, float eslora, Date añoFabricacion) {
        super.setMatricula(matricula);
        super.setEslora(eslora);
        super.setAñoFabricacion(añoFabricacion);
        super.setTipoDeBarco(TipoDeBarco.VELERO);
        
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }
    
    
}
