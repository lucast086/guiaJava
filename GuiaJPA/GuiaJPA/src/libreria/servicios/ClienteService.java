/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import libreria.control.ClienteController;
import libreria.entidades.Cliente;

/**
 *
 * @author lucas
 */
public class ClienteService {
    private ClienteController cC;

    public ClienteService() {
    cC = new ClienteController();
    }
    
    public Cliente crearCliente(Long documento, String nombre, String apellido, String telefono) {    
        try {
            Cliente c = new Cliente(null, documento,nombre,apellido,telefono);
            cC.crear(c);
            return c;
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
            return null;
        }
    }
    
    public Cliente encontrarId(Integer id) {
        try {
            Cliente cliente = cC.findId(id);
            return cliente;
        } catch (Exception e) {
            return null;
        }
    }
    
    public Cliente encontrarDni(Long dni) {
        try {
            Cliente cliente = cC.findDni(dni);
            return cliente;
        } catch (Exception e) {
            System.out.println("excepcion en encontrarDni");
            return null;
        }
    }
    
    
}
