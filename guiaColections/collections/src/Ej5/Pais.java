package Ej5;

import java.util.Comparator;

public class Pais {
    private String nombre;
    private String continente;
    private Long poblacion;

    public Pais(String nombre, String continente, Long poblacion) {
        this.nombre = nombre;
        this.continente = continente;
        this.poblacion = poblacion;
    }

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public Long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Long poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", continente='" + continente + '\'' +
                ", poblacion=" + poblacion +
                '}';
    }

    public static Comparator<Pais> comp = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };
}

