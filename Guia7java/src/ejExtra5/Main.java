package ejExtra5;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        int posicion = Math.toIntExact(Math.round(Math.random()*12));
        System.out.println(posicion);
        String mesSecreto = meses[posicion];
        boolean flag = true;
        do {
            System.out.println("");
            System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minusculas ");
            String mes = leer.next();
            if (mes.equals(mesSecreto)) {
                System.out.println("Que Oj** Adivinaste Felicidades");
                flag = false;
            } else System.out.println("Le erraste hermano, proba de nuevo");
        } while(flag);
    }
}
