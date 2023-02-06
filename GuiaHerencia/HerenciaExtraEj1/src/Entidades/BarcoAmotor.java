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
public class BarcoAmotor extends Barco {
    private int potenciaCV;

    public BarcoAmotor(int potenciaCV, int matricula, float eslora, Date añoFabricacion) {
        super.setMatricula(matricula);
        super.setEslora(eslora);
        super.setAñoFabricacion(añoFabricacion);
        super.setTipoDeBarco(TipoDeBarco.BARCOAMOTOR);
        
        this.potenciaCV = potenciaCV;
    }

    public BarcoAmotor() {
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
}
