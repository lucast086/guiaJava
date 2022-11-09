package Ej3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {
    ArrayList<Alumno> alumnos;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public AlumnoService() {
        this.alumnos = new ArrayList<>();
    }

    public AlumnoService(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void cargarAlumnos(){
        String opt;
        do {
            System.out.println("SISTEMA DE CREACION DE ALUMNOS");
            System.out.println("");
            System.out.println("Ingresar el nombre");
            String name = leer.nextLine();
            System.out.println("Ingrese la nota 1");
            int n1 = leer.nextInt();
            System.out.println("Ingrese la nota 2");
            int n2 = leer.nextInt();
            System.out.println("Ingrese la nota 3");
            int n3 = leer.nextInt();
            ArrayList<Integer> notas = new ArrayList<>(3);
            notas.add(n1);
            notas.add(n2);
            notas.add(n3);

            alumnos.add(new Alumno(name, notas));

            System.out.println("Alumno creado con exito - Presione una tecla para continuar");
            leer.nextLine();
            System.out.println("DESEA CREAR OTRO ALUMNO");
            opt = leer.nextLine().toUpperCase();
        } while (!opt.equals("N"));
    }

    public double notaFinal(){
        System.out.println("Ingrese el nombre del alumno para calcular nota final");
        String name = leer.nextLine().toLowerCase();
        double notaf = -1;
        for (Alumno a: alumnos) {
            if (a.getName().equals(name)){
                notaf = (a.getNotas().get(0) + a.getNotas().get(1) + a.getNotas().get(2)) / 3;
                break;
            }
        }
        return notaf;
    }
}
