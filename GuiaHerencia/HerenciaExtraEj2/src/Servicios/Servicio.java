/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Edificio;
import Entidades.Piso;
import Entidades.EdificioDeOficinas;
import Entidades.Oficina;
import Entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Servicio {

    Scanner leer = new Scanner(System.in);
    private ArrayList<Edificio> listaEdificios;

    public Servicio() {
        listaEdificios = new ArrayList<>();
    }

    public Edificio crearEdificio() {

        Edificio edificio;
        System.out.println("ELIJE TIPO DE EDIFICIO");
        System.out.println("1 Polideportivo");
        System.out.println("2 EdificioDeOficinas");
        int opt = Integer.parseInt(leer.nextLine());

        switch (opt) {
            case 1:
                edificio = crearPolideportivo();
                break;
            case 2:
                edificio = crearEdificioDeOficinas();
                break;
            default:
                System.out.println("opcion invalida");
                edificio = crearEdificio();

        }
        System.out.println(" ");
        return edificio;
    }

    private Polideportivo crearPolideportivo() {
        Polideportivo poli = new Polideportivo();

        System.out.println("ingrese nombre del polideportivo");
        poli.setNombre(leer.nextLine());

        System.out.println("ingrese tipo de instalacion");
        System.out.println(Enums.TipoDeInstalacion.ABIERTO.getValor());
        System.out.println(Enums.TipoDeInstalacion.TECHADO.getValor());
        String t = leer.nextLine();
        poli.setTipo(Enums.TipoDeInstalacion.valueOf(t.toUpperCase()));

        System.out.println("ingrese largo");
        poli.setLargo(Float.parseFloat(leer.nextLine()));

        System.out.println("ingrese ancho");
        poli.setAncho(Float.parseFloat(leer.nextLine()));

        System.out.println("ingrese alto");
        poli.setAlto(Float.parseFloat(leer.nextLine()));

        return poli;
    }

    private EdificioDeOficinas crearEdificioDeOficinas() {
        EdificioDeOficinas edi = new EdificioDeOficinas();

        System.out.println("Ingrese numero de pisos");
        int cantPisos = Integer.parseInt(leer.nextLine());

        ArrayList<Piso> pisos = new ArrayList<>(cantPisos);
        for (int i = 0; i < cantPisos; i++) {

            System.out.println("Ingrese numero de oficinas para el piso " + i);
            int cantOfis = Integer.parseInt(leer.nextLine());

            ArrayList<Oficina> ofis = crearOfis(cantOfis);

            Piso piso = new Piso(i, ofis);
            pisos.add(piso);
        }
        edi.setPisos(pisos);
        
        System.out.println("ingrese largo");
        edi.setLargo(Float.parseFloat(leer.nextLine()));

        System.out.println("ingrese ancho");
        edi.setAncho(Float.parseFloat(leer.nextLine()));

        System.out.println("ingrese alto");
        edi.setAlto(Float.parseFloat(leer.nextLine()));
        
        return edi;
    }

    private ArrayList<Oficina> crearOfis(int cantOfis) throws NumberFormatException {
        ArrayList<Oficina> ofis = new ArrayList<>(cantOfis);
        for (int j = 0; j < cantOfis; j++) {
            System.out.println("ingrese la capacidad de personas para la oficina " + (j + 1));
            int cantPers = Integer.parseInt(leer.nextLine());

            Oficina ofi = new Oficina(cantPers, (j + 1));
            ofis.add(ofi);

        }
        return ofis;
    }

    public void menu() {
        /*
        opcion crear edificio
        opcion ver info
        
         */
        int opt = 0;
        do {
            System.out.println(" ");
            System.out.println("MENU");
            System.out.println("1 CREAR EDIFICIO");
            System.out.println("2 VER INFORMACION DE EDIFICIO");
            System.out.println("3 SALIR");
            opt = Integer.parseInt(leer.nextLine());

            switch (opt) {

                case 1:
                    System.out.println("CREACION DE EDIFICIOS");
                    Edificio e = crearEdificio();

                    listaEdificios.add(e);

                    break;
                case 2:
                    System.out.println("MENU");
                    System.out.println("1 INFORME POR EDIFICIO");
                    System.out.println("2 INFORME GENERAL");
                    System.out.println("3 INFORME DE VOLUMEN Y SUPERFICIE");
                    int opt2 = Integer.parseInt(leer.nextLine());

                    switch (opt2) {
                        case 1:
                            for (int i = 0; i < listaEdificios.size(); i++) {

                                System.out.println("EDIFICIO " + (i + 1));
                                System.out.println(listaEdificios.get(i).toString());
                                System.out.println(" ");

                            }

                            int opt3 = Integer.parseInt(leer.nextLine());

                            if (listaEdificios.get(opt3 - 1) instanceof Polideportivo) {
                                System.out.println("MOSTRAR POLIDEPORTIVO");
                                mostrarPolideportivo(opt3-1);
                            } else {
                                System.out.println("MOSTRAR EDIFICIO DE OFICINAS");
                                cantPersonas(opt3-1);
                            }

                            break;
                        case 2 : 
                            System.out.println("INFORME GENERAL");
                            System.out.println(" ");
                            
                            int techados =0;
                            int abiertos =0;
                            for (int i = 0; i < listaEdificios.size(); i++) {
                                
                               
                                if (listaEdificios.get(i) instanceof Polideportivo p) {
                                    if (p.getTipo().equals(Enums.TipoDeInstalacion.ABIERTO)) abiertos++;
                                    else techados++;
                                } else {
                                    cantPersonas(i);
                                    
                                } 
                                System.out.println("");
                            }
                            System.out.println(" ");
                            System.out.println("*** POLIDEPORTIVOS ***");
                            System.out.println("CANTIDAD DE POLIDEPORTIVOS TECHADOS "+techados);
                            System.out.println("CANTIDAD DE POLIDEPORTIVOS ABIERTOS "+abiertos);
                            break;
                        case 3 :  
                            for (int i = 0; i < listaEdificios.size(); i++) {
                                listaEdificios.get(i).toString();
                                System.out.println(" ");
                                System.out.println("LA SUPERFICIE DEL EDIFICIO ES "+listaEdificios.get(i).calcularSuperficie());
                                System.out.println("EL VOLUMEN DEL EDIFICIO ES " +listaEdificios.get(i).calcularVolumen());
                                
                            }  
                            break;
                    }
            }
        } while (opt != 3);
    }

    private void mostrarPolideportivo(int i) {
        System.out.println(listaEdificios.get(i).toString());
    }

    private void cantPersonas(int i) {
        EdificioDeOficinas ed = (EdificioDeOficinas) listaEdificios.get(i);
        
        System.out.println(ed.toString());
        
        long sumaXedificio = 0;
        for (Piso p : ed.getPisos()) {
            System.out.println(p.toString());
            long sumaXpiso = 0;
            for (Oficina o : p.getOficinas() ) {
                System.out.println(o.toString());
                sumaXpiso += o.getCantPersonas();
                
            }
            System.out.println("TOTAL DE PERSONAS EN ESTE PISO "+sumaXpiso);
            System.out.println(" ");
            sumaXedificio += sumaXpiso;
            
        
        }
        System.out.println("TOTAL DE PERSONAS EN EL EDIFICIO "+sumaXedificio);
        System.out.println(" ");
        
        /*debe mostrar la informacion del edificio.
        ademas debe mostrar cuantas personas entran en todo el edificio.
        y cuantas en cada piso. (puede ser el metodo cantPersonas)
         */
    }

}
