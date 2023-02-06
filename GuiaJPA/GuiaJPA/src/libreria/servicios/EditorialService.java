/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import libreria.control.EditorialController;
import libreria.entidades.Editorial;

/**
 *
 * @author lucas
 */
public class EditorialService {
    private EditorialController eC = null;

    public EditorialService() {
        eC = new EditorialController();
    }
    
    public Editorial crearEditorial(String nombre) {
        try {
            Editorial e = new Editorial(null, nombre, true);
            eC.crear(e);
            return e;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return null;
        }
    }

    public Editorial modificarEditorial(Integer id, String nombre) {
        try {
            Editorial e = eC.findId(id);
            e.setNombre(nombre);
            eC.editar(e);
            return e;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return null;
        }
    }

    public Boolean borrarEditorial(Integer id) {
        try {
            eC.borrar(id);
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }
    
        public Editorial encontrarId(Integer id) {
        try {
            Editorial editorial = eC.findId(id);
            return editorial;
        } catch (Exception e) {
            return null;
        }
    }
}
