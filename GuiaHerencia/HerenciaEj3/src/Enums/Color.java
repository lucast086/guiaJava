/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author lucas
 */
public enum Color {
    BLANCO("Blanco"),
    NEGRO("Negro"),
    ROJO("Rojo"),
    AZUL("Azul"),
    GRIS("Gris");
    
    String valu;

    public String getValu() {
        return valu;
    }

    private Color(String valu) {
        this.valu = valu;
    }
    
    public static Color defecto(){
        return BLANCO;
    }
    
    
}
