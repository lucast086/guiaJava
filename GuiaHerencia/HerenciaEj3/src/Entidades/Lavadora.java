/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enums.Color;
import Enums.ConsumoEnergetico;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {

    }

    public Lavadora(int carga, Float precio, Color color, ConsumoEnergetico consumoEnergetico, Float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        crearElectrodomestico();
        
        System.out.println("Ingrese la carga");
        this.carga = Integer.parseInt(leer.nextLine());
        
    }

    @Override
    public void precioFinal() {
        
        if (carga > 30) {
            super.setPrecio(super.getPrecio()+500);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "{ carga=" + carga + '}';
    }
    
    
    
}
