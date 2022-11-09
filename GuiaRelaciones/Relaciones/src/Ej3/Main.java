package Ej3;

import Ej3.Servicios.BCservicio;

public class Main {
    public static void main (String[] args){
        BCservicio bCservicio = new BCservicio();

        bCservicio.crearBaraja();
        bCservicio.menu();

    }
}
