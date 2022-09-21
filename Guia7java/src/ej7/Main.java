package ej7;

import ej7.Entidad.Persona;
import ej7.Service.PersonaService;

public class Main {
    public static void main (String[]args){
        Persona[] personas = new Persona[2];
        PersonaService personaService = new PersonaService();

        //crear personas
        for (int i = 0 ; i < personas.length;i++){
            personas[i] = personaService.crearPersona();
            if (personaService.esMayorDeEdad(personas[i])) System.out.println("LA PERSONA "+(i+1)+" ES MAYOR DE EDAD");
            else System.out.println("LA PERSONA "+(i+1)+"ES MENOR DE EDAD");
        }

        int pi = 0, pu = 0, pd = 0;
        int mayor = 0;
        for (int i = 0 ; i < personas.length;i++){
            switch (personaService.calcularIMC(personas[i]) ){
                case -1 : pd++;
                    break;
                case 0 : pi++;
                    break;
                case 1 : pu++;
                    break;
            }

        }
        double porc = (mayor*100)/4;
        System.out.println("PERSONAS CON PESO IDEAL: "+pi);
        System.out.println("PERSONAS CON SOBREPESO: "+pu);
        System.out.println("PERSONAS CON PESO BAJO: "+pd);
        System.out.println("PERSONAS MAYORES DE EDAD: "+porc+" %");
        System.out.println("PERSONAS MENORES DE EDAD: "+(100-porc)+" %");
    }
}
