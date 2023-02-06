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
public class Electrodomestico {
   
    //atributos
    private Float precio;
    private Color color;
    private ConsumoEnergetico consumoEnergetico;
    private Float peso;

    //constructores
    public Electrodomestico() {
    }

    public Electrodomestico(Float precio, Color color, ConsumoEnergetico consumoEnergetico, Float peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    //setter getter
    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
    
    
    //metodos
 private Color comprobarColor(String col){     
        
        for(Color c : Color.values()){
            if (col.equalsIgnoreCase(c.getValu())) {
                return c;
            }
        }        
        return Color.defecto();
    }
    
       private ConsumoEnergetico comprobarConsumoEnergetico(char letra){

        for (ConsumoEnergetico cE : ConsumoEnergetico.values()){
            if (letra == cE.getIdentificador()) {
                return cE;
            }
        }
        return ConsumoEnergetico.defecto();
    }
    
    public void crearElectrodomestico(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("CREACION DE ELECTRODOMESTICO");
        System.out.println("Ingrese Precio");
        this.precio = Float.valueOf(leer.nextLine());
        System.out.println("Ingrese Color");
        this.color = comprobarColor(leer.nextLine());
        System.out.println("Ingrese Consumo Energetico");
        this.consumoEnergetico = comprobarConsumoEnergetico(leer.nextLine().toUpperCase().charAt(0));
        System.out.println("Ingrese Peso");
        this.peso = Float.valueOf(leer.nextLine());
               
    }
    
    public void precioFinal(){
   
        
        if (peso < 20) {
            this.precio += 100;
        } else if (peso < 50){
            this.precio += 500;
        } else if (peso < 80){
            this.precio += 800;
        } else this.precio += 1000;
        
    }
    
    
      // no me convence que un electrodomestico pueda crearse a si mismo, pero a fines practicos de la guia voy a dejar la seccion de metodos aqui
    // aunque esto deberia de implementarse en otra clase, segun el patron de sieño elegido.

    @Override
    public String toString() {
        return "Electrodomestico: {" + "color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
}
