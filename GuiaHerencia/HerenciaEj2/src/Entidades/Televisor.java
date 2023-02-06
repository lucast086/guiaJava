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
public class Televisor extends Electrodomestico{
    private float pulgadas;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(float pulgadas, boolean sintonizadorTDT,Float precio, Color color, ConsumoEnergetico consumoEnergetico, Float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        crearElectrodomestico();
        System.out.println("Ingrese la resolucion");
        this.pulgadas = Integer.parseInt(leer.nextLine());
        System.out.println("Tiene sintonizador? S/N");
        this.sintonizadorTDT = false;
        if (leer.nextLine().equalsIgnoreCase("s")) this.sintonizadorTDT = true;
       
    }

    @Override
    public void precioFinal() {
        float precio = 0;
        float multi = 1;
        if (pulgadas > 40) {
             multi += 0.3;
        }
        if (sintonizadorTDT) precio = 500;
        
        super.setPrecio( (super.getPrecio() + precio) * multi );
        
    }
    
      @Override
    public String toString() {
        return super.toString() + "{ pulgadas=" + pulgadas + "sintonizadorTDT " + sintonizadorTDT + '}';
    }
}
