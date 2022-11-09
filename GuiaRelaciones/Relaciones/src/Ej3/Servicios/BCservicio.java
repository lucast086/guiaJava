package Ej3.Servicios;

import Ej3.Entidades.Baraja;
import Ej3.Entidades.Carta;
import Ej3.enums.NumCarta;
import Ej3.enums.Palo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class BCservicio {
    Baraja barajaInicial;
    Baraja barajaMesa;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public BCservicio() {
    }

    public void crearBaraja(){
        barajaMesa = new Baraja(new LinkedList<>());
        LinkedList<Carta> cartas = new LinkedList<>();
        for (Palo palo : Palo.values()) {
            for (NumCarta num : NumCarta.values()) {
                cartas.add(new Carta(palo,num));
            }
        }
        barajaInicial = new Baraja(cartas);
    }

    public void barajar(){
        if ( barajaInicial.getCartas().isEmpty()) {
            System.out.println("JUNTANDO CARTAS DE LA MESA");
            barajaInicial.setCartas(barajaMesa.getCartas());
            barajaMesa.getCartas().clear();
        }
        System.out.println("BARAJANDO...");
        Collections.shuffle(barajaInicial.getCartas());
    }

    public Carta siguienteCarta() {
        if (!barajaInicial.getCartas().isEmpty()) {

            barajaMesa.getCartas().add(barajaInicial.getCartas().getFirst());
            barajaInicial.getCartas().removeFirst();
            System.out.println(barajaMesa.getCartas().getLast().toString());
            return barajaMesa.getCartas().getLast();
        } else {
            System.out.println("BARAJA VACIA");
            return null;
        }
    }

    public int cartasDisponibles(){
        int cant = barajaInicial.getCartas().size();
        System.out.println(cant);
        return cant;
    }

    public LinkedList<Carta> darCartas(){
        System.out.println("ingrese cantidad de cartas a dar");
        int cant = leer.nextInt();
        LinkedList<Carta> cartas = new LinkedList<>();
        if (cant > barajaInicial.getCartas().size()){
            System.out.println("NO HAY SUFICIENTES CARTAS");
        } else {
            for (int i = 0 ; i < cant ; i++){
                Carta carta = barajaInicial.getCartas().getFirst();
                cartas.add(carta);
                barajaMesa.getCartas().add(carta);
                barajaInicial.getCartas().removeFirst();
            }
        }
        return cartas;
    }

    public LinkedList<Carta> cartasMonton(){
        for (Carta carta : barajaMesa.getCartas()) {
            System.out.println(carta.toString());
        }
        return barajaMesa.getCartas();
    }

    public LinkedList<Carta> mostrarBaraja(){
        for (Carta carta : barajaInicial.getCartas()) {
            System.out.println(carta.toString());
        }
        return barajaInicial.getCartas();
    }

    public void menu() {
        System.out.println("");
        System.out.println("----- MENU -----");
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Barajar el mazo");
        System.out.println("2. Ver siguiente carta");
        System.out.println("3. Pedir cartas");
        System.out.println("4. Ver cartas ya usadas");
        System.out.println("5. Ver cartas aún en el mazo");
        System.out.println("6. Salir del programa");
        System.out.println("");
        String opc = leer.next();
        switch (opc) {
            case "1":
                barajar();
                System.out.println("Mazo barajado");
                menu();
                break;
            case "2":
                siguienteCarta();
                menu();
                break;
            case "3":
                darCartas();
                menu();
                break;
            case "4":
                cartasMonton();
                menu();
                break;
            case "5":
                mostrarBaraja();
                menu();
                break;
            case "6":
                System.out.println("Ejecución finalizada");
                break;
            default:
                System.out.println("Opcion no válida");
                ;
                menu();
        }

    }

}
