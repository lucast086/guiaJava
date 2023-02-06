/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author lucas
 */
public class FabricanteService {
    
    FabricanteDAO fDAO;
    Scanner leer = new Scanner(System.in);

    public FabricanteService() {
        this.fDAO = new FabricanteDAO();
    }
    
    public void ingresarFabricante() {
         try {
             
            System.out.println("INGRESE NOMBRE: ");
            String nombre = leer.next();
            if (nombre.isBlank()) throw new Exception("nombre no valido");
            leer.nextLine();
            
            fDAO.cargar(new Fabricante(0, nombre));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void listarFabricantes() {
        try {
            Collection<Fabricante> fabricantes = fDAO.listar();
            
            System.out.println("** TABLA DE FABRICANTES **");
            System.out.println("* COD - NOMBRE  *");
            for (Fabricante f : fabricantes) {
                System.out.println(f.toString());
            }
            System.out.println("*************************");
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
                       
    }
    
    
}
