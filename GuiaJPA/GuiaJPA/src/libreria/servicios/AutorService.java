/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.ArrayList;
import java.util.List;
import libreria.control.AutorController;
import libreria.entidades.Autor;

/**
 *
 * @author lucas
 */
public class AutorService {

    private AutorController aC = null;

    public AutorService() {
        aC = new AutorController();
    }

    public Autor crearAutor(String nombre) {
        try {
            Autor a = new Autor(null, nombre, true);
            aC.crear(a);
            return a;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return null;
        }
    }

    public Autor modificarAutor(Integer id, String nombre) {
        try {
            Autor a = aC.findId(id);
            a.setNombre(nombre);
            aC.editar(a);
            return a;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return null;
        }
    }

    public Boolean borrarAutor(Integer id) {
        try {
            aC.borrar(id);
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }
    
    public List<Autor> encontrarXnombre(String nombre) {
        List<Autor> autores = new ArrayList<>();
        try {
            autores = aC.findName(nombre);
        } catch (Exception e) {
            System.out.println("ERROR "+e.getMessage());
        } finally {
            return autores;
        }
    }
    
    public Autor encontrarId(Integer id) {
        try {
            Autor autor = aC.findId(id);
            return autor;
        } catch (Exception e) {
            return null;
        }
    }

}
