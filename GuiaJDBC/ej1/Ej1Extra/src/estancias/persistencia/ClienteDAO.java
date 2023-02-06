/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.persistencia;

import estancias.entidades.Cliente;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author lucas
 */
public class ClienteDAO extends DAO{

    public ClienteDAO() {
    }
    


// listar clientes

// (E) lista de clientes que tuvieron una estancia y  descripcion de la casa donde estuvieron
    /* debo tner una que me liste todos los clientes que hicieron una estancia 
    y una descripcion de todos los comentarios.
    
    y la logica hacerla en el servicio*/

    
    
    //falta terminar
public Collection<Cliente> listarClientes() throws Exception {
        try {
            String sql = "SELECT * FROM clientes;";
            consultar(sql);
            
            Cliente cliente = null;
            Collection<Cliente> clienteCollection = new ArrayList();
            
            while (resultado.next()){
                cliente = new Cliente();
                cliente.setId_cliente(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
                cliente.setNumero(resultado.getInt(4));
                cliente.setCodigo_postal(resultado.getString(5));
                cliente.setCiudad(resultado.getString(6));
                cliente.setPais(resultado.getString(7));
                cliente.setEmail(resultado.getString(8));
                                
                clienteCollection.add(cliente);
            }            
            
            return clienteCollection;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectar();
        }
    }


public Cliente consulta(int id_cliente) throws Exception {
try {
            String sql = "SELECT * FROM clientes WHERE id_cliente = '"+id_cliente+"' ;";
            consultar(sql);
            
            Cliente cliente = null;
            while (resultado.next()){
                cliente = new Cliente();
                cliente.setId_cliente(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
                cliente.setNumero(resultado.getInt(4));
                cliente.setCodigo_postal(resultado.getString(5));
                cliente.setCiudad(resultado.getString(6));
                cliente.setPais(resultado.getString(7));
                cliente.setEmail(resultado.getString(8));
            }            
            
            return cliente;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectar();
        }
}

}