/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enums.TipoDeBarco;
import java.util.Date;

/**
 * tengo dudas si esta clase deberia ser abstracata.
 * @author lucas
 */
public abstract class Barco {
    private int matricula;
    private float eslora;
    private Date añoFabricacion;
    private TipoDeBarco tipoDeBarco;


    
    /*
    public Barco() {
    }

    public Barco(int matricula, float eslora, Date añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

   */
    
    public TipoDeBarco getTipoDeBarco() {
        return tipoDeBarco;
    }

    public void setTipoDeBarco(TipoDeBarco tipoDeBarco) {
        this.tipoDeBarco = tipoDeBarco;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public Date getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(Date añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    
}
