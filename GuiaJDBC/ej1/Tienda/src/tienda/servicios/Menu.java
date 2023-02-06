/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * en esta clase se pone la iteraccion con el usuario los menu etc.
 * @author lucas
 */
public class Menu {
    Scanner leer = new Scanner(System.in);
    

    public void menuPrincipal() {
        int opcion = 0;
        
        do {
            try {
                System.out.println("*****  MENU PRINCIPAL  *****");
                System.out.println("* 1.- Fabricantes          *");
                System.out.println("* 2.- Productos            *");
                System.out.println("* 3.- Salir                *");
                System.out.println("****************************");
        
                opcion = leer.nextInt();
                                
                switch (opcion) {
                    case 1:
                        menuFabricantes();
                        break;
                    case 2:
                        menuProductos();
                        break;
                    case 3:
                        System.out.println("ADIOS");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("OPCION INVALIDA");
                leer.next();
            }
        } while (opcion != 3);

    }

    private void menuFabricantes() {
        int opcion = 0;
        FabricanteService fService = new FabricanteService();
        
        do {
            try {
                System.out.println("*****  MENU FABRICANTES  *****");
                System.out.println("* 1.- Nuevo Fabricante       *");
                System.out.println("* 2.- Listar Fabricantes     *");
                System.out.println("* 3.- Salir                  *");
                System.out.println("******************************");
        
                opcion = leer.nextInt();
                                
                switch (opcion) {
                    case 1:
                        fService.ingresarFabricante();
                        break;
                    case 2:
                        fService.listarFabricantes();
                        break;
                    case 3:
                        System.out.println("ADIOS");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("OPCION INVALIDA");
                leer.next();
            }
        } while (opcion != 3);    
    }
    


    private void menuProductos() {
        int opcion = 0;
        ProductoService pService = new ProductoService();
        
        do {
            try {
                System.out.println("********  MENU PRODUCTOS  ********");
                System.out.println("* 1.- Nuevo Producto             *");
                System.out.println("* 2.- Listar Productos           *");
                System.out.println("* 3.- Listar por nombre y precio *");
                System.out.println("* 4.- Listar por Rango de precio *");
                System.out.println("* 5.- Listar Portatiles          *");
                System.out.println("* 6.- Listar producto mas barato *");
                System.out.println("* 7.- Editar Producto            *");
                System.out.println("* 8.- Salir                      *");
                System.out.println("**********************************");
        
                opcion = leer.nextInt();
                                
                switch (opcion) {
                    case 1:
                        pService.ingresarProducto();
                        break;
                    case 2:
                        pService.listarProductos();
                        break;
                    case 3:
                        pService.listarNombPrecio();
                        break;
                    case 4:
                        pService.listarRango();
                        break;
                    case 5:
                        pService.listarPortatiles();
                        break;
                    case 6:
                        pService.listarBarato();
                        break;
                    case 7:
                        pService.modificarProducto();
                        break;
                    case 8:
                        System.out.println("ADIOS");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("OPCION INVALIDA");
                leer.next();
            }
        } while (opcion != 8);  
    }
    
}
