package Ej1.Entidades;

public class Perro {
    String nombre;
    String raza;
    Integer edad;
    String tamaño;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro[ " +
                "nombre=' " + nombre + '\'' +
                ", raza=' " + raza + '\'' +
                ", edad= " + edad +
                ", tamaño=' " + tamaño + '\'' +
                ']';
    }
}
