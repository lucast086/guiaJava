package ejAprendizaje;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class ej12 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        String x;
        int c = 0, i = 0;
        String fde = "&&&&&";
        do {
            System.out.println("ingrese una frase");
            x = leer.nextLine();
            if (x.toUpperCase().startsWith("X") && x.toUpperCase().endsWith("O") && x.length() == 5) c++;
            else if (!x.equals(fde)) i++;

        } while (!x.equalsIgnoreCase(fde));
        System.out.println("lecturas correctas "+c);
        System.out.println("lecturas incorrectas "+i);
    }

}
