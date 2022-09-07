package ejExtra;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int ht = 0, media = 0;
        System.out.println("Ingrese la cantidad de familias");
        int nf = leer.nextInt();

        for (int i = 1; i <= nf;i++){
            System.out.println("ingrese la cantidad de hijos de la familia "+i);
            int nh = leer.nextInt();
            ht += nh;
            for (int j = 1 ; j <= nh;j++){
                System.out.println("Ingrese la edad del "+j+"° hijo");
                media += leer.nextInt();
            }
        }
        System.out.println("la Media de edad de todos los hijos es: "+media/ht);
    }
}
