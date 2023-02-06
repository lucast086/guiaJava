
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
        
        ArrayList<Electrodomestico> lista = new ArrayList<>();
        
        for (int i = 0; i < 2; i++) {
            
            Lavadora lavatodo = new Lavadora();

            lavatodo.crearLavadora();

            System.out.println(lavatodo.toString());

            Televisor tele = new Televisor();

            tele.crearTelevisor();

            System.out.println(tele.toString());

            

            lista.add(tele);
            lista.add(lavatodo);
        
        }
        
        float sumaTeles= 0, sumaLavadoras= 0, sumaElectros = 0;
        
        for (Electrodomestico electro : lista) {
            electro.precioFinal();
            electro.toString();
            
            sumaElectros += electro.getPrecio();
            
            if (electro instanceof Televisor) sumaTeles += electro.getPrecio();
            if (electro instanceof Lavadora) sumaLavadoras += electro.getPrecio();
           
        }
        System.out.println("Suma de todos los electrodomesticos: " + sumaElectros);
        System.out.println("Suma de todos los Televisores: " + sumaTeles);
        System.out.println("Suma de todos las Lavadoras: " + sumaLavadoras);
        
        
       
    }
    
}
