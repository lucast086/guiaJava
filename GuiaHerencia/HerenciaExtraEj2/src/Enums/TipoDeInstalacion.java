/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author lucas
 */
public enum TipoDeInstalacion {
    
    TECHADO ("TECHADO"),
    ABIERTO ("ABIERTO");
    
    String valor;

    private TipoDeInstalacion(String valor) {
        this.valor = valor;
    }
    

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "TipoDeInstalacion{" + "valor=" + valor + '}';
    }
    
    
    
}
