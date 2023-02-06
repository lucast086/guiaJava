/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.control;

import java.util.List;
import libreria.entidades.Libro;

/**
 *
 * @author lucas
 */
public class LibroController extends JPAcontroller<Libro > {


    public LibroController() {
        super();
    }

    
    public void crear(Libro  libro) {
            super.create(libro);
    }
        
    public void editar(Libro  libro) {
        super.update(libro);
    }

    public void borrar(Long id) {
       Libro  libro = findId(id);
       super.delete(libro);
    }
    
    
    public Libro  findId(Long id) {
        conect();
        Libro  libro = em.find(Libro .class, id);
        disconect();
        return libro;
 
    } 
    
    public List<Libro> findAll() {
        conect();
        List<Libro> libros = em.createQuery("SELECT a FROM Libro a").getResultList();
        disconect();
        return libros;
    }
    
    public List<Libro> findTitle(String title) {
        conect();
        List<Libro> libros = em.createQuery("SELECT a FROM Libro a WHERE a.titulo LIKE :title")
                .setParameter("title", title).getResultList();
        disconect();
        return libros;
    }
    
     public List<Libro> findAutor(String name) {
        conect();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.Autor a WHERE a.nombre LIKE :name")
                .setParameter("name", name).getResultList();
        disconect();
        return libros;
    }
 
     public List<Libro> findEditorial(String name) {
        conect();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.Editorial e WHERE e.nombre LIKE :name")
                .setParameter("name", name).getResultList();
        disconect();
        return libros;
    }
     
}
