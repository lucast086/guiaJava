package Ej6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoService {
    Map<String,Float> stock = new HashMap<>();
    Scanner leer = new Scanner(System.in);


    public ProductoService() {
    }

    public void crearProducto(){
        String opt;
        do {

            System.out.println("INGRESE EL NOMBRE DEL PRODUCTO");
            String nombre = leer.nextLine().toLowerCase();
            System.out.println("INGRESE EL PRECIO DEL PRODUCTO");
            Float precio = Float.parseFloat(leer.nextLine());
            stock.put(nombre, precio);
            System.out.println("desea ingresar otro producto? S / N ");
            opt = leer.nextLine();
        } while (opt.equalsIgnoreCase("S"));
    }
    public void mostrarProductos(){
        for (Map.Entry<String,Float> p : stock.entrySet()) {
            System.out.println("-| PRODUCTO: "+p.getKey()+" PRECIO: "+p.getValue());
        }
    }
    public void eliminarProducto(){
        System.out.println("INGRESE EL NOMBRE DEL PRODUCTO A ELIMINAR");
        String key = leer.nextLine().toLowerCase();
        if (stock.containsKey(key)) {
            stock.remove(key);
            System.out.println("PRODUCTO ELIMINADO");
        } else System.out.println("PRODUCTO INEXISTENTE");
    }
    public void modificarPrecio(){
        System.out.println("INGRESE EL NOMBRE DEL PRODUCTO A MODIFICAR");
        String key = leer.nextLine().toLowerCase();
        if (stock.containsKey(key)) {
            System.out.println("INGRESE NUEVO PRECIO");
            Float nuevoPrecio = Float.parseFloat(leer.nextLine());
            stock.replace(key,nuevoPrecio);
            System.out.println("PRODUCTO MODIFICADO");
        } else System.out.println("PRODUCTO INEXISTENTE");

    }
}
