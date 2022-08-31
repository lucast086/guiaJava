package Primerosejercicios;

import java.util.Scanner;

public class ejercicio11 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("ingrese una frase terminada en punto");
        frase = leer.nextLine();

        System.out.println("frase codificada: "+ codificar(frase));
    }

    private static String codificar(String s){
        int i;
        String result = "";

        for (i = 0; i < s.length();i++){
            switch (s.charAt(i)) {
                case 'a': result += "@";
                    break;
                case 'e': result += "#";
                    break;
                case 'i': result += "$";
                    break;
                case 'o': result += "%";
                    break;
                case 'u': result += "*";
                    break;
                default: result += s.charAt(i);
            }
        }
        return result;
    }
}
