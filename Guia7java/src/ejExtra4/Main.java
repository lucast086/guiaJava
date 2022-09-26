package ejExtra4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Nif nif1 = crearNif();
        mostrarNif(nif1);
    }

    public static Nif crearNif(){
        Scanner leer = new Scanner(System.in);
        String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        System.out.println("INGRESE EL DNI");
        long dni = leer.nextLong();
        int posicion = (int) dni % 23;
        return new Nif(dni,letras[posicion]);
    }

    public static void mostrarNif(Nif nif){
        System.out.println(nif.getDni()+"-"+ nif.getNif());
    }
}
