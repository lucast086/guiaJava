/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.FabricanteDAO;
import tienda.persistencia.ProductoDAO;

/**
 * en esta clase deberiamos de realizar la validaciones de los datos que nos pasan para la creacion y podria
 * dejar la iteraccion del usuario a otra clase menu. o se puede implementar aca,
 * tratar las excepciones de las clases DAO. o puedo trasladarlas y tratarlas luego.
 * que el objeto a cargar sea nulo ya esta controlado en la entidadDAO
 * por lo que aqui deberia validar que los datos correspondan con lo solicitado.
 * @author lucas
 */
public class ProductoService {

    ProductoDAO pDAO;
    FabricanteDAO fDAO;
    Scanner leer = new Scanner(System.in);
    
    public ProductoService() {
        this.pDAO = new ProductoDAO();
        this.fDAO = new FabricanteDAO();
    }
    
    public void listarProductos() {
        try {
            Collection<Producto> productos = pDAO.listar();
            
            System.out.println("** TABLA DE PRODUCTOS **");
            System.out.println("* COD - NOMBRE - PRECIO - COD_FABRICANTE *");
            for (Producto p : productos) {
                System.out.println(p.toString());
            }
            System.out.println("******************************************");
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
                       
    }
    
    public void listarNombPrecio() {
        try {
            Collection<Producto> productos = pDAO.listar();
            
            System.out.println("** TABLA DE PRODUCTOS **");
            System.out.println("* NOMBRE - PRECIO  *");
            for (Producto p : productos) {
                System.out.println("  " +p.getNombre() + "   "+ p.getPrecio());
            }
            System.out.println("******************************************");
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
                       
    }
    
     public void listarRango() {
        try {
            
            // puse para elegir el rango aunque sea fijo, para poder aplicar el control con if
            System.out.println("Ingrese el precio minimo");
            double p1 = leer.nextDouble();
            
            if (p1 < 0) throw new Exception("precio negativo");
            leer.nextLine();
            
            System.out.println("Ingrese el precio maximo");
            double p2 = leer.nextDouble();
            
            if (p2 < p1) throw new Exception("precio maximo menor que precio minimo");
            leer.nextLine();
               
            Collection<Producto> productos = pDAO.listarXrango(p1, p2);
            
            System.out.println("** TABLA DE PRODUCTOS **");
            System.out.println("* COD - NOMBRE - PRECIO - COD_FABRICANTE *");
            for (Producto p : productos) {
                System.out.println(p.toString());
            }
            System.out.println("******************************************");
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
                       
    }
     
     public void listarPortatiles() {
        try {
            // se puede pedir al usuario que ingrese la palabra a buscar. y controlarla
            Collection<Producto> productos = pDAO.listarXnombre("Portatil");
            
            System.out.println("** TABLA DE PRODUCTOS **");
            System.out.println("* COD - NOMBRE - PRECIO - COD_FABRICANTE *");
            for (Producto p : productos) {
                System.out.println(p.toString());
            }
            System.out.println("******************************************");
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
                       
    }
     
    public void listarBarato() {
        try {
            Producto p = pDAO.minimoPrecio();
            System.out.println("Producto con el Minimo Precio");          
            System.out.println("* NOMBRE - PRECIO  *");
            System.out.println("  " +p.getNombre() + "   "+ p.getPrecio());
            
            System.out.println("******************************************");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ingresarProducto()  {
         try {
             
            System.out.println("INGRESE NOMBRE: ");
            String nombre = leer.nextLine();
            if (nombre.isBlank()) throw new Exception("nombre no valido");
            leer.nextLine();
            System.out.println("INGRESE PRECIO: ");
            double precio = leer.nextDouble();
            leer.nextLine();
            if (precio < 0) throw new Exception("precio negativo");
            System.out.println("INGRESE CODIGO DE FABRICANTE: ");
            int cod_fab = leer.nextInt();
            if (!fDAO.isValid(cod_fab)) throw new Exception("Codigo de Fabricante no valido");
            
            pDAO.cargar(new Producto(0, nombre, precio,cod_fab));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void modificarProducto() {
         try {
            //voy a pedir y buscar el codigo del producto, luego pido los datos a modificar
            System.out.println("INGRESE EL CODIGO DEL PRODUCTO A BUSCAR"); 
            int cod = leer.nextInt();
            Producto p = pDAO.buscarXcodigo(cod);
            
            if (p == null) throw new Exception("producto inexistente");
            
            System.out.println("");
            System.out.println("* COD - NOMBRE - PRECIO - COD_FABRICANTE *"); 
            System.out.println(p.toString());
            
            System.out.println("INGRESE NOMBRE: ");
            String nombre = leer.next();
            if (nombre.isBlank()) throw new Exception("nombre no valido");
            leer.nextLine();
            System.out.println("INGRESE PRECIO: ");
            double precio = leer.nextDouble();
            if (precio < 0) throw new Exception("precio negativo");
            System.out.println("INGRESE CODIGO DE FABRICANTE: ");
            int cod_fab = leer.nextInt();
            if (fDAO.isValid(cod_fab)) throw new Exception("Codigo de Fabricante no valido");
            
            pDAO.cargar(new Producto(0, nombre, precio,cod_fab));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    
}
