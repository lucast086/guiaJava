/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author lucas
 */
public class Caballo extends Animal {
    
       public Caballo(String nombre, String alimento, int edad, String raza) {
        super.alimento = alimento;
        super.nombre = nombre;
        super.edad = edad;
        super.raza = raza;
    }

    @Override
    public void Alimentarse() {
        System.out.println("se alimenta de heno");
    }
    
}
