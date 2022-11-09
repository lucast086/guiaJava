package Ej4;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaService {
    Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

    public PeliculaService() {
    }

    public void crearPeliculas(){
        int opt;
        do {
            System.out.println("BIENVENIDO A LA CREACION DE PELICULAS");
            leer.nextLine();
            System.out.println("INGRESE EL TITULO DE LA PELICULA");
            String titulo = leer.nextLine();
            System.out.println("INGRESE EL DIRECTOR DE LA PELICULA");
            String director = leer.nextLine();
            System.out.println("INGRESE LA DURACION DE LA PELICULA");
            float duracion = leer.nextFloat();
            Pelicula pp = new Pelicula(titulo, director, duracion);
            listaPeliculas.add(pp);
            System.out.println("");
            System.out.println("PELICULA CREADA CON EXITO");
            System.out.println("");
            System.out.println("DESEA INGRESAR OTRA PELICULA 1- SI  //  2- NO");
            opt = leer.nextInt();
        } while (opt == 1);
    }

    public void mostrarPeliculas() {
        for (Pelicula p : listaPeliculas) {
            System.out.println(" ");
            System.out.println(p.toString());
            System.out.println(" ");
        }
    }

    public void mostrarPeliculasDuracion(){
        for (Pelicula p : listaPeliculas) {
            if (p.getDuracion() >= 1) {
                System.out.println(" ");
                System.out.println(p.toString());
                System.out.println(" ");
            }
        }
    }

    public void ordenarXduracionMm(){
        listaPeliculas.sort(Pelicula.comparadorXduracionMm);
    }
    public void ordenarXduracionmM(){
        listaPeliculas.sort(Pelicula.comparadorXduracionmM);
    }
    public void ordenarXtitulo(){
        listaPeliculas.sort(Pelicula.comparadorXtitulo);
    }
    public void ordenarXdirector(){
        listaPeliculas.sort(Pelicula.comparadorXdirector);
    }


}
