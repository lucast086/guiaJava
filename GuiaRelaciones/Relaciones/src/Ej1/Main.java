package Ej1;

import Ej1.Entidades.Perro;
import Ej1.Entidades.Persona;
import Ej1.Servicios.Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner leer = new Scanner(System.in);
    static Servicios service = new Servicios();
    static List<Persona> personas = new ArrayList<>();
    static List<Perro> perros = new ArrayList<>();

    public static void main (String[]args){
        System.out.println("creacion de personas");
        for (int i = 0 ; i < 2 ; i++){
            personas.add(service.crearPersona());
        }

        System.out.println("creacion de perros");
        for (int i = 0 ; i < 2 ; i++){
            perros.add(service.crearPerro());
        }

        for (Persona p : personas) {
            boolean ctrl = false;
            do {

                System.out.println("La persona: " + p.getNombre() + " " + p.getApellido() + " quiere adoptar un perrito");
                System.out.println("Elija un perrito de la siguiente lista");

                for (Perro pp : perros) {
                    System.out.println(pp.toString());
                }
                String perroElegido = leer.nextLine();
                for (int i = 0; i < perros.size(); i++) {
                    if (perroElegido.equalsIgnoreCase(perros.get(i).getNombre())) {
                        ctrl = true;
                        perros.remove(i);
                        break;
                    }
                }
                if (ctrl) System.out.println("PERRITO ADOPTADO");
                else System.out.println("PERRITO NO ENCONTRADO");
            } while (!ctrl);
        }





    }
}
