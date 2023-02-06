/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enums.TipoDeBarco;

/**
 *
 * @author lucas
 */
public class Amarre {
    private int ubicacion;
    private boolean disponible;
    private TipoDeBarco tipoDebarco;

    public Amarre() {
    }

    public Amarre(int ubicacion, boolean disponible, TipoDeBarco tipoDebarco) {
        this.ubicacion = ubicacion;
        this.disponible = disponible;
        this.tipoDebarco = tipoDebarco;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public TipoDeBarco getTipoDebarco() {
        return tipoDebarco;
    }

    public void setTipoDebarco(TipoDeBarco tipoDebarco) {
        this.tipoDebarco = tipoDebarco;
    }
    
    
}
