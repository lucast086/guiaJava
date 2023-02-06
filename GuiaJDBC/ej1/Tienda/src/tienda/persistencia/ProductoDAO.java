/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

/**
 * esta clase debe tener un crud, crear leer modificar eliminar, y listar tambien, el leer puede estar 
 * implementado varias veces segun el criterio de busqueda.
 * el modificar y eliminar deberian ser siempre por la clave.
 * hereda de DAO para utilizar metodos para conectarse con la base de datos
 * tiene la funcion de transferir datos entre la base de datos y estructuras de datos que puede usaar java. y viceversa
 * @author sasaPrograma Youtube     :)
 */
public final class ProductoDAO extends DAO{

    public ProductoDAO() {
    }
    
    public void cargar(Producto producto) throws Exception   {
        try {
            if (producto == null) {
                throw new Exception("prudcto nulo");
            }
            String sql = "INSERT INTO producto" +
                "(nombre , precio, codigo_fabricante) " +
                "VALUES ( '"+ producto.getNombre() + "' , "+
                producto.getPrecio() + " , " + 
                producto.getCodigo_fabricante() + ");";
            
            crud(sql);
        } catch (Exception e){
            throw e;
        } finally {
            desconectar();
        }
    }
    
    public void modificar(Producto producto) throws Exception   {
        try {
            if (producto == null) {
                throw new Exception("prudcto nulo");
            }
            String sql = "UPDATE producto SET " +
                "nombre = " + producto.getNombre() +", "+
                "precio = " + producto.getPrecio() +", "+
                "codigo_fabricante = " + producto.getCodigo_fabricante() + 
                " WHERE codigo = " + producto.getCodigo() + ";" ;
            
            crud(sql);
        } catch (Exception e){
            throw e;
        } finally {
            desconectar();
        }
    }
    
       
    public void eliminar(Producto producto) throws Exception   {
        try {
            if (producto == null) {
                throw new Exception("prudcto nulo");
            }
            String sql = "DELETE FROM producto WHERE codigo = '" + producto.getCodigo() + "' ;" ;
            
            crud(sql);
        } catch (Exception e){
            throw e;
        } finally {
            desconectar();
        }
    }
    
    public Collection<Producto> listar() throws Exception {
        try {
            String sql = "SELECT * FROM producto;";
            
            
            consultar(sql);
            
            Producto product = null;
            Collection<Producto> productCollection = new ArrayList();
            while (resultado.next()) {
                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                product.setCodigo_fabricante(resultado.getInt(4));
                productCollection.add(product);
            }
            return productCollection;
           
        } catch (Exception e){
            throw e;
        } finally {
            desconectar();
        }
    }
    
    
    
    
    
    // podria hacer un buscarXnombre donde filtre por una palabra que este contenida en el nombre
    public Collection<Producto> listarXnombre(String name) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%"+name+"%';";
            
            
            consultar(sql);
            
            Producto product = null;
            Collection<Producto> productCollection = new ArrayList();
            while (resultado.next()) {
                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                product.setCodigo_fabricante(resultado.getInt(4));
                productCollection.add(product);
            }
            return productCollection;
           
        } catch (Exception e){
            throw e;
        } finally {
            desconectar();
        }
    }
    
    // podria hacer un buscar que filtre por un rango de precios
    public Collection<Producto> listarXrango(Double precio1, Double precio2) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN "+precio1 +" AND " +precio2+ ";";
            
            
            consultar(sql);
            
            Producto product = null;
            Collection<Producto> productCollection = new ArrayList();
            while (resultado.next()) {
                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                product.setCodigo_fabricante(resultado.getInt(4));
                productCollection.add(product);
            }
            return productCollection;
           
        } catch (Exception e){
            throw e;
        } finally {
            desconectar();
        }
    }
    
    public Producto minimoPrecio() throws Exception{
        try {
            String sql = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1";
            consultar(sql);
            Producto product = null;
            while (resultado.next()){
                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                product.setCodigo_fabricante(resultado.getInt(4));
            }
            return product;

        } catch (Exception e) {
            throw e;
        } finally {
            desconectar();
        }
    }
    
 public Producto buscarXcodigo(int cod) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo = '"+cod+"';";
            
            
            consultar(sql);
            
            Producto product = null;
            
            if (resultado.next()) {
                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                product.setCodigo_fabricante(resultado.getInt(4));
             
            }
            return product;
           
        } catch (Exception e){
            throw e;
        } finally {
            desconectar();
        }
    }
    
}
