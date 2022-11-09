package Ej1.Servicios;

import Ej1.Entidades.Perro;
import Ej1.Entidades.Persona;

import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona(){
        Persona p = new Persona();
        System.out.println("INGRESE NOMBRE DE LA PERSONA");
        p.setNombre(leer.nextLine());
        System.out.println("INGRESE APELLIDO DE LA PERSONA");
        p.setApellido(leer.nextLine());
        System.out.println("INGRESE EDAD DE LA PERSONA");
        p.setEdad(Integer.parseInt(leer.nextLine()));
        System.out.println("INGRESE DNI DE LA PERSONA");
        p.setDni(Integer.parseInt(leer.nextLine()));
        return p;
    }
    public Perro crearPerro(){
        Perro p = new Perro();
        System.out.println("INGRESE NOMBRE DEL PERRO");
        p.setNombre(leer.nextLine());
        System.out.println("INGRESE RAZA DEL PERRO");
        p.setRaza(leer.nextLine());
        System.out.println("INGRESE EDAD DEL PERRO");
        p.setEdad(Integer.parseInt(leer.nextLine()));
        System.out.println("INGRESE TAMAÑO DEL PERRO");
        p.setTamaño(leer.nextLine());
        return p;
    }
}
