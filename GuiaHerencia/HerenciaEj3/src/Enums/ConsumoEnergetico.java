/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author lucas
 */
public enum ConsumoEnergetico {

    A('A',1000),
    B('B',800),
    C('C',600),
    D('D',500),
    E('E',300),
    F('F',100);
    
    
    char identificador;
    float precio;

    private ConsumoEnergetico(char identificador, float precio) {
        this.identificador = identificador;
        this.precio = precio;
    }

    public char getIdentificador() {
        return identificador;
    }
    
    public float getPrecio() {
        return precio;
    }
    
    public static ConsumoEnergetico defecto(){
        return F;
    } 
    
}
