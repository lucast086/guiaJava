/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.control;

import java.util.ArrayList;
import java.util.List;
import libreria.entidades.Cliente;

/**
 *
 * @author lucas
 */
public class ClienteController extends JPAcontroller<Cliente>{

    public ClienteController() {
        super();    
    }
    
    public void crear(Cliente cliente) {
            super.create(cliente);
    }
        


    public void editar(Cliente cliente) {
        super.update(cliente);
    }

    public void borrar(Integer id) {
       Cliente cliente = findId(id);
       super.delete(cliente);
    }
    
    public Cliente findId(Integer id) {
        conect();
        Cliente cliente = em.find(Cliente.class, id);
        disconect();
        return cliente;
 
    }
    
    public Cliente findDni(Long dni) {
        List<Cliente> cliente = new ArrayList();
        
        conect();
        cliente = em.createQuery("SELECT c FROM Cliente c WHERE c.documento = :dni").setParameter("dni", dni).getResultList();
        disconect();
        return cliente.get(0);
 
    }
    
    public List<Cliente> findAll() {
        conect();
        List<Cliente> clientes = em.createQuery("SELECT a FROM Cliente a").getResultList();
        disconect();
        return clientes;
    }
    
}
