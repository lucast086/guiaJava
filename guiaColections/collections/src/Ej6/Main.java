package Ej6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        ProductoService productoService = new ProductoService();
        menu(productoService);
    }
    /* el menu tiene que tener un CRUD */
    public static void menu(ProductoService ps) {
        Scanner leer = new Scanner(System.in);
        int opt = 0;
        do {
            do {
                System.out.println("*************************");
                System.out.println("*      TIENDA EGG       *");
                System.out.println("*************************");
                System.out.println(" 1- CARGAR PRODUCTO     *");
                System.out.println(" 2- BORRAR PRODUCTO     *");
                System.out.println(" 3- VER PRODUCTO        *");
                System.out.println(" 4- MODIFICAR PRODUCTO  *");
                System.out.println(" 5- SALIR               *");
                System.out.println("*************************");
                opt = leer.nextInt();
            } while (opt != 1 && opt != 2 && opt != 3 && opt != 4 && opt != 5);
            switch (opt) {
                case 1: ps.crearProducto();
                    break;
                case 2: ps.eliminarProducto();
                    break;
                case 3: ps.mostrarProductos();
                    break;
                case 4: ps.modificarPrecio();
                    break;
                case 5:
                    System.out.println("GRACIAS ");
                    break;
            }
        } while (opt != 5);
    }
}
