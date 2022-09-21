package ej12;

import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    Scanner leer = new Scanner(System.in);
    public PersonaService() {
    }

    public Persona crearPersona(){
        System.out.println("INGRESE EL NOMBRE DE LA PERSONA");
        String nom = leer.nextLine();
        System.out.println("INGRESE LA FECHA DE NACIMIENTO DE LA PERSONA CON EL FORMATO dd/mm/aaaa");
        String fecha = leer.nextLine();
        int dia = Integer.parseInt(fecha.substring(0,2));
        int mes = Integer.parseInt(fecha.substring(3,5));
        int anio = Integer.parseInt(fecha.substring(6,10));
        Date fechaNac= new Date(anio-1900,mes-1,dia);
        return new Persona(nom, fechaNac);
    }
    public int calcularEdad(Persona p){
        Date fActual= new Date();
        // lo que hago es crear una fecha con el dia de nacimiento el mes de nacimiento y el año actual.
        Date fComp = new Date(fActual.getYear()-1900,p.getFechaNacimiento().getMonth()-1,p.getFechaNacimiento().getDay());
        //calulo la edad que deberia tener en el corriente año
        int edad = fActual.getYear()-p.getFechaNacimiento().getYear();

        if (fComp.after(fActual)) { //si la fecha compuesta es mayor a la actual quiere decir que aun no cumplio años
            return edad-1;          // este año. y resto 1.
        } else return edad;         //caso contrario ya cumplio años.
    }

   // public Period calcularEdad2(Persona p){
       // return Period.between(p.getFechaNacimiento(),LocalDate.now());
  //  }
    public boolean menorQue(Persona p, int edad){
        return calcularEdad(p) < edad;
    }
    public void mostrarPersona(Persona p){
        System.out.println(p.toString());
    }
}
