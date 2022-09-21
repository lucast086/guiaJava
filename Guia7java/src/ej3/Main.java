package ej3;


import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Operacion op = crearOperacion();
        System.out.println("SUMA "+op.sumar());
        System.out.println("RESTA "+op.restar());
        System.out.println("MULTIPLICAR "+op.multiplicar());
        System.out.println("DIVIDIR "+op.dividir());
    }
    public static Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        double n1 = leer.nextDouble();
        System.out.println("Ingrese el numero 2");
        double n2 = leer.nextDouble();
        return new Operacion(n1,n2);
    }
}
