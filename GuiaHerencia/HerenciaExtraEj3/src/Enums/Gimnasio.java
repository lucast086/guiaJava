/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author lucas
 */
public enum Gimnasio {
    A("A"),
    B("B");
    
    private final String tipo;
  

    private Gimnasio(String tipo) {
        this.tipo = tipo;
 
    }

    public String getTipo() {
        return tipo;
    } 
    
    
}
