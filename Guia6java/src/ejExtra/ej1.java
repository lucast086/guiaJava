package ejExtra;

import java.util.Scanner;

public class ej1 {
    public static void main (String[]args){
        int diaMin = 1440;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de minutos");
        int mm = leer.nextInt();
        int dia = Math.round(mm/diaMin);
        System.out.println("dias: "+dia);
        int horas;
        if (mm > diaMin) horas = Math.round((mm-diaMin)/60);
        else horas = Math.round(mm/60);
        System.out.println("Horas: "+horas);
    }
}
