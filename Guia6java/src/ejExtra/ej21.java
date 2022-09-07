package ejExtra;

import java.util.Scanner;

public class ej21 {
    public static void  main (String []args ){
        double[] note = new double[10];
        notas(note);
        aprobados(note);
    }

    private static void aprobados(double[] note) {
        double notaA = 7;
        int a= 0,d = 0;
        for (int i = 0 ; i < note.length;i++){
            if (note[i] >= notaA) a++;
            else d++;
        }
        System.out.println("Cantidad de aprobados "+a);
        System.out.println("Cantidad de desaprobados "+d);
    }

    static void notas(double[] ar)  {
        Scanner leer = new Scanner(System.in);
        double p1, p2, tpe1, tpe2;
        for (int i = 0 ; i < ar.length; i++){
            System.out.println("ALUMNO: "+(i+1));
            System.out.println("Ingrese las notas: ");
            System.out.print("trabajo Practico Evaluativo 1: ");
            tpe1 = leer.nextFloat();
            System.out.print("trabajo Practico Evaluativo 2: ");
            tpe2 = leer.nextFloat();
            System.out.print("Parcial 1: ");
            p1 = leer.nextFloat();
            System.out.print("Parcial 2: ");
            p2 = leer.nextFloat();
            System.out.println("");
            double prom = tpe1*0.1 + tpe2*0.15 + p1*0.25 + p2*0.5;
            ar[i] = prom;
        }

    }
}
