/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.control;

import java.util.List;
import libreria.entidades.Editorial;

/**
 *
 * @author lucas
 */
public class EditorialController extends JPAcontroller<Editorial> {


    public EditorialController() {
        super();
    }

    
    public void crear(Editorial editorial) {
            super.create(editorial);
    }
        
    public void editar(Editorial editorial) {
        super.update(editorial);
    }

    public void borrar(Integer id) {
       Editorial editorial = findId(id);
       super.delete(editorial);
    }
    
    public List<Editorial> findAll() {
        conect();
        List<Editorial> editorial = em.createQuery("SELECT a FROM Editorial a").getResultList();
        disconect();
        return editorial;
    }
    
    public Editorial findId(Integer id) {
        conect();
        Editorial editorial = em.find(Editorial.class, id);
        disconect();
        return editorial;
 
    }
}
