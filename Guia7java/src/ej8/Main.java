package ej8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main (String []args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaService cS = new CadenaService();

        System.out.println("INGRESE UNA FRASE");
        String frase = leer.nextLine();
        Cadena cadena = cS.crearCadena(frase,frase.length());
        System.out.println("");

        System.out.println("INGRESE UNA letra A reemplazar");
        String letter = leer.nextLine();
        System.out.println(""+cS.reemplazar(cadena,letter));
        System.out.println("");

        System.out.println(""+cS.mostrarVocales(cadena));
        System.out.println("");

        System.out.println(""+cS.invertirFrase(cadena));
        System.out.println("");

        System.out.println("INGRESE UNA LETRA A BUSCAR");
        letter = leer.nextLine();
        System.out.println(""+cS.vecesRepetido(cadena,letter));
        System.out.println("");

        System.out.println("INGRESE UNA frase A comparar");
        frase = leer.nextLine();
        System.out.println(""+cS.compararLongitud(cadena,frase));
        System.out.println("");
//aca puedo poner un if else if y ver si es mayor menor o igual que cero apra devovler un sout mas legible.
        System.out.println("INGRESE UNA frase A unir");
        frase = leer.nextLine();
        System.out.println(""+cS.unirFrases(cadena,frase));
        System.out.println("");

        System.out.println("INGRESE UNA letra A ver si esta");
        letter = leer.nextLine();
        System.out.println(""+cS.contiene(cadena,letter));
        System.out.println("");

    }
}
