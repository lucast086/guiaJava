package ej12;

public class Main {
    public static void main (String[]args){
        PersonaService personaService = new PersonaService();
        Persona persona = personaService.crearPersona();

        personaService.mostrarPersona(persona);
        System.out.println(personaService.menorQue(persona,45));
        System.out.println(personaService.calcularEdad(persona));

    }

}
