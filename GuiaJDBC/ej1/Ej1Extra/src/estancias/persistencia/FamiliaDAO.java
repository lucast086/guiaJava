/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.persistencia;

import estancias.entidades.Familia;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author lucas
 */
public class FamiliaDAO extends DAO {

    public FamiliaDAO() {
    }
    
    // (C) listar familias filtrando por direccion de email
    public Collection<Familia> listar(String email) throws Exception {
        try {
            String sql = "SELECT * FROM familias WHERE email LIKE '%"+email+"%' ;";
            consultar(sql);
            
            Familia familia = null;
            Collection<Familia> familiaCollection = new ArrayList();
            
            while (resultado.next()){
                familia = new Familia();
                familia.setId_familia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setId_casa_familia(resultado.getInt(7));
                familiaCollection.add(familia);
            }            
            
            return familiaCollection;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectar();
        }
    }


    // (A) listar familias por edad maxima y cantidad minima de hijos
    public Collection<Familia> listarXedad(int cantHijos, int edadMax) throws Exception {
        try {
            String sql = "SELECT * FROM familias WHERE num_hijos >= '"+cantHijos+"' AND edad_maxima <= '"+edadMax +"' ;";
            consultar(sql);
            
            Familia familia = null;
            Collection<Familia> familiaCollection = new ArrayList();
            
            while (resultado.next()){
                familia = new Familia();
                familia.setId_familia(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familia.setId_casa_familia(resultado.getInt(7));
                familiaCollection.add(familia);
            }            
            
            return familiaCollection;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectar();
        }
    }
}
