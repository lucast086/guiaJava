package ej1;

import java.util.Scanner;
public class Main {
    public static void main (String[] args){

    Libro libro = new Libro();

    cargarLibro(libro);
    System.out.println(libro.toString());
    }


    static void cargarLibro(Libro l){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro");
        l.setISBN(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese el Titulo del libro");
        l.setTitulo(leer.nextLine());
        System.out.println("Ingrese el Autor del libro");
        l.setAutor(leer.nextLine());
        System.out.println("Ingrese el N° de pagianas del libro");
        l.setNumPages(leer.nextInt());
    }


}
