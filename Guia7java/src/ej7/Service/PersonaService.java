package ej7.Service;

import ej7.Entidad.Persona;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PersonaService {
    Scanner l = new Scanner(System.in).useDelimiter("\n");
    public PersonaService() {
    }
    public Persona crearPersona(){
        Persona p = new Persona();
        System.out.println("Ingrese el nombre");
        p.setNombre(l.next());
        System.out.println("Ingrese el apellido");
        p.setApellido(l.next());
        String opt;
        do{
            System.out.println("INGRESE EL SEXO ");
            System.out.println("H: HOMBRE");
            System.out.println("M: MUJER");
            System.out.println("O: OTRO");
            opt = l.next();
        } while (isValidChar(opt));
        p.setSexo(opt);
        System.out.println("Ingrese la edad");
        p.setEdad(l.nextInt());
        System.out.println("Ingrese el peso");
        p.setPeso(l.nextDouble());
        System.out.println("Ingrese la altura");
        p.setAltura(l.nextDouble());
        return p;
    }

    private boolean isValidChar(String opt) {
        String validChars = "HMO";
        return validChars.contains(opt);
    }

    public int calcularIMC(Persona p){
        double imc = p.getPeso()/(Math.pow(p.getAltura(), 2));
        if ( imc < 20) return -1;
        else if (20 <= imc && imc <= 25) return 0;
        else return 1;
    }
    public boolean esMayorDeEdad(Persona p){
        if (p.getEdad() >= 18) return true;
        return false;
    }



}
