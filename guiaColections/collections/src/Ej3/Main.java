package Ej3;

public class Main {
    public static void main (String[] args ) {
        AlumnoService alumnoService = new AlumnoService();

        alumnoService.cargarAlumnos();
        double notaf = alumnoService.notaFinal();
        if (notaf == -1) System.out.println("ALUMNO NO ENCONTRADO");
        else System.out.println("la nota final es: "+ notaf);
    }
}
