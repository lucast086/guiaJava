package ejExtra3;

import java.util.Scanner;

public class Main {
    //ESTE EJERCICIO SE PUED OPTIMIZAR MUCHO, YA QUE HAY METODOS U POCO REDUNDANTES.
    public static void main (String[]args){
        RaicesService raicesService = new RaicesService();
        Raices raices1 = raicesService.crearRaices();

        raicesService.calcular(raices1);
    }


}
