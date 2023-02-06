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
public class YateDeLujo extends Barco {
    private int numCamarotes;
    private int potenciaCV;

    public YateDeLujo(int numCamarotes, int potenciaCV, int matricula, float eslora, Date añoFabricacion) {
        super.setMatricula(matricula);
        super.setEslora(eslora);
        super.setAñoFabricacion(añoFabricacion);
        super.setTipoDeBarco(TipoDeBarco.YATEDELUJO);
        
        this.numCamarotes = numCamarotes;
        this.potenciaCV = potenciaCV;
    }

    public YateDeLujo() {
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    
}
