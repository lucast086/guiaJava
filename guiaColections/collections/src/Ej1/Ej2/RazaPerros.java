package Ej1.Ej2;

import java.util.*;

public class RazaPerros {
    public static void main (String[] args){


        List<String> razaPerros = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        String opt, raza;
        do {
            System.out.println("Ingrese una raza de perro");
            raza = leer.nextLine();
            razaPerros.add(raza.toLowerCase());
            System.out.println("Desea ingresar otro S / N");
            opt = leer.nextLine();
        } while (!opt.equals("N"));
        for (String r: razaPerros) {
            System.out.println(r);
        }

        System.out.println("");
        System.out.println("Ingrese una raza de perro a buscar");
        raza = leer.nextLine().toLowerCase();

        //ordeno la lista
        Collections.sort(razaPerros);

        if (razaPerros.contains(raza)) { //verifico si tiene el elemento
            Iterator<String> it = razaPerros.iterator();

            while (it.hasNext()) { //busco y elimino el elemento
                if (it.next().equals(raza)) {
                    it.remove();
                    System.out.println("PERRO ELIMINADO");
                    break;
                }
            }
        } else System.out.println("PERRO NO ENCONTRADO"); //caso que no existe elemento

        // muestro la lista
        for (String r: razaPerros) {
            System.out.println(r);
        }
    }
}
