package EjercicioGuarderia;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Guarderia {
    static Scanner leer = new Scanner(System.in);
    static ArrayList<String> nombresDeMascotas = new ArrayList<>();

    public static void main (String[]args){

        Menu();

    }

    public static void Menu(){

        int opt = 0;
        do {
            do {
                System.out.println("**************************");
                System.out.println("*  LA GUARDERIA DE SASA  *");
                System.out.println("**************************");
                System.out.println(" 1- INGRESAR MASCOTA     *");
                System.out.println(" 2- ELIMINAR MASCOTA     *");
                System.out.println(" 3- EDITAR MASCOTA       *");
                System.out.println(" 4- MOSTRAR MASCOTAS     *");
                System.out.println(" 5- ORDENAR MASCOTAS     *");
                System.out.println(" 6- SALIR                *");
                System.out.println("**************************");
                opt = Integer.parseInt(leer.nextLine());
            } while (opt != 1 && opt != 2 && opt != 3 && opt != 4 && opt != 5 && opt != 6);
            switch (opt) {
                case 1: ingresarMascota();
                    break;
                case 2: eliminarMascota();
                    break;
                case 3: editarMascota();
                    break;
                case 4: mostrarMascotas();
                    break;
                case 5: ordenarMascotas();
                    break;
                case 6:
                    System.out.println("GRACIAS ");
                    break;
            }
        } while (opt != 6);
    }

    public static void ingresarMascota(){
        System.out.println("Ingresar nombre de la mascota");
        String nombre = leer.nextLine();
        nombresDeMascotas.add(nombre);
        System.out.println("mascota ingresada con exito!");
        System.out.println("Presione una tecla para volver al menu");
        leer.nextLine();
    }
    public static void eliminarMascota(){
        System.out.println("Ingrese el nombre de la mascota a eliminar");
        String nombre = leer.nextLine();

        if (nombresDeMascotas.remove(nombre)) {
            System.out.println("La mascota puede ser retirada");
        } else System.out.println("La mascota NO se encuentra en la lista");

    }

    public static void editarMascota(){
        System.out.println("Ingrese el nombre de la mascota a editar");
        String nombre = leer.nextLine();
        for (int i = 0 ; i < nombresDeMascotas.size() ; i++) {
            if (nombresDeMascotas.get(i).equalsIgnoreCase(nombre)){
                System.out.println("Ingrese nuevo nombre");
                String nuevoNombre = leer.nextLine();
                nombresDeMascotas.set(i,nuevoNombre);
                System.out.println("Mascota editada con exito");
                break;
            }
        }
    }
    public static void mostrarMascotas(){
        System.out.println("LISTA DE MASCOTAS EN LA GUARDE");
        for (String mascota: nombresDeMascotas) {
            System.out.println("Nombre:" +mascota);
        }
    }

    public static void ordenarMascotas(){
        Collections.sort(nombresDeMascotas);
    }

}
