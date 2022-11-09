package Ej4;

public class Main {
    public static void main (String[] args){
        PeliculaService peliculaService = new PeliculaService();
        peliculaService.crearPeliculas();
        peliculaService.mostrarPeliculas();

        System.out.println("ORDENANDO POR TITULO");
        peliculaService.ordenarXtitulo();
        peliculaService.mostrarPeliculas();

        System.out.println("ORDENANDO POR DIRECTOR");
        peliculaService.ordenarXdirector();
        peliculaService.mostrarPeliculas();

        System.out.println("ORDENANDO POR DURACION DE MAYOR A MENOR");
        peliculaService.ordenarXduracionMm();
        peliculaService.mostrarPeliculas();

        System.out.println("ORDENANDO POR DURACION DE MENOR A MAYOR");
        peliculaService.ordenarXduracionmM();
        peliculaService.mostrarPeliculas();

        System.out.println("PELICULAS DE DURACION MAYOR A 1 HORA");
        peliculaService.mostrarPeliculasDuracion();

    }
}
