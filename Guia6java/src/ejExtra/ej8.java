package ejExtra;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, par = 0, impar = 0;
        while (true){
            System.out.println("ingrese un numero entero mayor que 0 - los numeros negativos no seran registrados");
            n = leer.nextInt();
            if (n >= 0) {
                if (n % 5 == 0) break;
                if (n %2 == 0 ) par++;
                else impar++;
            }
        }
        System.out.println("numeros pares: "+par);
        System.out.println("numeros impares: "+impar);
    }
}
