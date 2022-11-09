package Ej1.Entidades;

public class Persona {
String nombre;
String apellido;
Integer edad;
Integer dni;
Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{ " +
                "nombre=' " + nombre + '\'' +
                ", apellido=' " + apellido + '\'' +
                ", edad= " + edad +
                ", dni= " + dni +
                ", perro= " + perro +
                '}';
    }
}
