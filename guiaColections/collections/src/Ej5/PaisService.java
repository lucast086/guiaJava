package Ej5;

import Ej4.Pelicula;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisService {
    TreeSet<Pais> paises = new TreeSet<>(Pais.comp);
    Scanner leer = new Scanner(System.in);

    public PaisService() {
    }

    public void crearPais(){
        int opt;
        do {
            System.out.println("BIENVENIDO A LA CREACION DE PAISES");
            System.out.println("INGRESE EL NOMBRE DEL PAIS");
            String nombre = leer.nextLine();
            System.out.println("INGRESE EL CONTINENTE DEL PAIS");
            String continente = leer.nextLine();
            System.out.println("INGRESE LA POBLACION DEL PAIS");
            long poblacion = leer.nextLong();
            Pais pp = new Pais(nombre, continente, poblacion);
            paises.add(pp);
            System.out.println("");
            System.out.println("PAIS CREADO CON EXITO");
            System.out.println("");
            System.out.println("DESEA INGRESAR OTRO PAIS 1- SI  //  2- NO");
            opt = leer.nextInt();
            leer.nextLine();
        } while (opt == 1);
    }
    public void mostrarPaises(){
        for (Pais p : paises) {
            System.out.println(p.toString());
        }
    }

    public void eliminarPais(){
        System.out.println("INGRESE EL PAIS QUE DESEA ELIMINAR");
        String p = leer.nextLine();
        Iterator<Pais> it = paises.iterator();
        boolean flag = false;
        while(it.hasNext()){
            if(p.equalsIgnoreCase(it.next().getNombre()) ){
                it.remove();
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("PAIS ELIMINADO");
        else System.out.println("PAIS NO ENCONTRADO");
    }

}
