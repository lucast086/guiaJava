package ej6.Entidades;

public class Cafetera {
    Long capMaxima;
    Long cantActual;

    public Cafetera() {
    }
    public Cafetera(Long capMaxima, Long cantActual) {
        this.capMaxima = capMaxima;
        this.cantActual = cantActual;
    }

    public Long getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(Long capMaxima) {
        this.capMaxima = capMaxima;
    }

    public Long getCantActual() {
        return cantActual;
    }

    public void setCantActual(Long cantActual) {
        this.cantActual = cantActual;
    }

    public void llenarCafetera(){
        cantActual = capMaxima;
    }
    public void  vaciarCafetera(){
        cantActual = 0L;
    }
    public void agregarCafe(Long cafe){
        if (cantActual+cafe >= capMaxima) llenarCafetera();
        else cantActual += cafe;
    }
    public void servirTaza(int tamano){
        int tazaCH = 100;
        int tazaM = 150;
        int tazaG = 200;
        if (cantActual > 0) {
            switch (tamano) {
                case 1:
                    if (tazaCH < cantActual) {
                        cantActual -= tazaCH;
                        System.out.println("taza llena al 100%");
                    } else {
                        System.out.println("taza llena un " + ((cantActual * 100) / tazaCH) + " %");
                        cantActual = 0L;
                    }
                    break;
                case 2:
                    if (tazaM < cantActual) {
                        cantActual -= tazaM;
                        System.out.println("taza llena al 100%");
                    } else {
                        System.out.println("taza llena un " + ((cantActual * 100) / tazaM) + " %");
                        cantActual = 0L;
                    }
                    break;
                case 3:
                    if (tazaG < cantActual) {
                        cantActual -= tazaG;
                        System.out.println("taza llena al 100%");
                    } else {
                        System.out.println("taza llena un " + ((cantActual * 100) / tazaG) + " %");
                        cantActual = 0L;
                    }
                    break;
            }
        } else System.out.println("MAQUINA SIN CAFE, IMPOSIBLE SERVIR");
    }

}
