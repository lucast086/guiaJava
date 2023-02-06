/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

/**
 *
 * @author lucas
 */
public class FabricanteDAO extends DAO{

    public FabricanteDAO() {
    }
    
    public void cargar(Fabricante fabricante) throws Exception   {
        try {
            if (fabricante == null) {
                throw new Exception("fabricante nulo");
            }
            String sql = "INSERT INTO fabricante" +
                "(nombre) " +
                "VALUES ( '"+ fabricante.getNombre() + "');";
            
            crud(sql);
        } catch (Exception e){
            throw e;
        } finally {
            desconectar();
        }
    }
    
    public void modificar(Fabricante fabricante) throws Exception   {
        try {
            if (fabricante == null) {
                throw new Exception("fabricante nulo");
            }
            String sql = "UPDATE producto SET " +
                "nombre = " + fabricante.getNombre() +", "+ 
                " WHERE codigo = " + fabricante.getCodigo() + ";" ;
            
            crud(sql);
        } catch (Exception e){
            throw e;
        } finally {
            desconectar();
        }
    }
    
    public void eliminar(Fabricante fabricante) throws Exception   {
        try {
            if (fabricante == null) {
                throw new Exception("fabricante nulo");
            }
            String sql = "DELETE FROM producto WHERE codigo = '" + fabricante.getCodigo() + "' ;" ;
            
            crud(sql);
        } catch (Exception e){
            throw e;
        } finally {
            desconectar();
        }
    }
    
    public Collection<Fabricante> listar() throws Exception {
        try {
            String sql = "SELECT * FROM fabricante;";
            
            
            consultar(sql);
            
            Fabricante fabricantes = null;
            Collection<Fabricante> fabriCollection = new ArrayList();
            while (resultado.next()) {
                fabricantes = new Fabricante();
                fabricantes.setCodigo(resultado.getInt(1));
                fabricantes.setNombre(resultado.getString(2));
                fabriCollection.add(fabricantes);
            }
            return fabriCollection;
           
        } catch (Exception e){
            throw e;
        } finally {
            desconectar();
        }
    }
    
    public boolean isValid(int i) throws Exception {
        try {
            String sql ="SELECT codigo FROM fabricante WHERE codigo = '"+i+"';";
            consultar(sql);
            return resultado.next();
        } catch (Exception e) {
            throw e;
        }
    }
    
}
