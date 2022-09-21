package ej6;

import ej6.Entidades.Cafetera;

public class Main {
    public static void main (String[]args){
        Cafetera saeco = new Cafetera(1000L,0L);
        saeco.llenarCafetera();
        saeco.servirTaza(1);
        saeco.servirTaza(2);
        saeco.servirTaza(3);
        saeco.servirTaza(1);
        saeco.servirTaza(3);
        saeco.servirTaza(2);
        saeco.servirTaza(2);
        saeco.servirTaza(3);
        saeco.agregarCafe(350L);
        saeco.servirTaza(3);

    }
}
