/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author lucas
 */
public enum TipoDeBarco {
    YATEDELUJO("Yate De Lujo"),
    VELERO("Velero"),
    BARCOAMOTOR("Barco a Motor");
    
    private final String valor;

    private TipoDeBarco(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    
    
    
}
