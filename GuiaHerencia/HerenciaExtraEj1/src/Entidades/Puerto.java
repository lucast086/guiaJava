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
public class Puerto {
    private ArrayList<Amarre> amarres;

    public Puerto() {
    }

    public Puerto(ArrayList<Amarre> amarres) {
        this.amarres = amarres;
    }

    public ArrayList<Amarre> getAmarres() {
        return amarres;
    }

    public void setAmarres(ArrayList<Amarre> amarres) {
        this.amarres = amarres;
    }
    
    
    
}
