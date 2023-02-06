
import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class Main {
    
    public static void main (String[] args) {
        Animal perro1 = new Perro("Stich","Carnivoro",15,"Doberman");
        perro1.Alimentarse();
        
        Animal perro2 = new Perro("Teddy","Corquetas",10,"Chihuahua");
        perro2.Alimentarse();
        
        Animal gato1 = new Gato("Pelusa","Galletas",15,"Siames");
        gato1.Alimentarse();
        
        Animal caballo1 = new Caballo("Pelusa","Galletas",15,"Siames");   
        caballo1.Alimentarse();
    
    }
    
}
