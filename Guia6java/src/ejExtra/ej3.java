package ejExtra;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class ej3 {
    public static void main (String[]args){
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese una letra, si ingresa mas, se quedara con la primera");
        String l = leer.next().substring(0,1);
        String voc = "AEIOU";
        System.out.println(l);
        if (voc.contains(l.toUpperCase())) System.out.println("Es una vocal");
        else System.out.println("No es una vocal");
        }
}

