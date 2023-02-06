/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.control;

import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author lucas
 */
public class AutorController extends JPAcontroller<Autor> {
   

    public AutorController() {
        super();
    }

    
    public void crear(Autor autor) {
            super.create(autor);
    }
        


    public void editar(Autor autor) {
        super.update(autor);
    }

    public void borrar(Integer id) {
       Autor autor = findId(id);
       super.delete(autor);
    }
    
    public Autor findId(Integer id) {
        conect();
        Autor autor = em.find(Autor.class, id);
        disconect();
        return autor;
 
    }
    
    public List<Autor> findName(String name) {
        conect();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :name")
                .setParameter("name", name).getResultList();
        disconect();
        return autores;
    }
    
    public List<Autor> findAll() {
        conect();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        disconect();
        return autores;
    }
}
