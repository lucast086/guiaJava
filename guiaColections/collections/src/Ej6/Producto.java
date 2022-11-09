package Ej6;

public class Producto {
    String nombre;
    Float precio;

    public Producto() {
    }

    public Producto(String nombre, Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "-| Producto: " +
                "nombre= " + nombre + '\'' +
                ", precio= " + precio +
                " |- ";
    }
}
