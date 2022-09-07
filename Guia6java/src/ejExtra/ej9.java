package ejExtra;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el primer numero");
        int resto = leer.nextInt();
        System.out.println("ingrese el segundo numero");
        int b = leer.nextInt();
        int cociente = 0;
        while (resto > b)  {
            resto -= b;
            cociente++;
        }
        System.out.println("Cociente: "+cociente);
        System.out.println("Resto: "+resto);

    }
}
