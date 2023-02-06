
import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class Main {
    public static void main (String[] args){
        
        Lavadora lavatodo = new Lavadora();
       
        lavatodo.crearLavadora();
       
        System.out.println(lavatodo.toString());
        System.out.println("precio lavadora " + lavatodo.getPrecio());
        
        Televisor tele = new Televisor();
       
       
        tele.crearTelevisor();
       
        System.out.println(tele.toString());
        System.out.println("precio tele "+ tele.getPrecio());
        

       
    }
    
}
