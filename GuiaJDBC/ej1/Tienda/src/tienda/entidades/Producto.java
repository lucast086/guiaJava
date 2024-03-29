/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.entidades;

/**
 * en esta clase solamente deberia ir los setter getters
 * constructor y los atributos que serian los mismos que
 * encontramos en la tabla.
 * tambien puede ir el tostring y el equals o esos metodos de entidad.
 * 
 * @author lucas
 */
public class Producto {
    
    private int codigo;
    private String nombre;
    private Double precio;
    private int codigo_fabricante;

    public Producto() {
    }

    public Producto(int codigo, String nombre, Double precio, int codigo_fabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigo_fabricante = codigo_fabricante; //forane key
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCodigo_fabricante() {
        return codigo_fabricante;
    }

    public void setCodigo_fabricante(int codigo_fabricante) {
        this.codigo_fabricante = codigo_fabricante;
    }

    @Override
    public String toString() {
        return "  " + codigo + "   " + nombre + "   " + precio + "   " + codigo_fabricante;
    }
    
    
    
}
