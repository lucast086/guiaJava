/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author lucas
 */
public class JPAcontroller<T> {
    protected EntityManagerFactory emf;
    protected EntityManager em;

    public JPAcontroller() {
        
      emf = Persistence.createEntityManagerFactory("libreriaPU");
      em = emf.createEntityManager();
      
    }
    
    protected void conect() {
        if (!em.isOpen()) em = emf.createEntityManager();
    }
    
    protected void disconect() {
        if (em.isOpen()) em.close();
    }
    
    protected void create(T object) {
        conect();
        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();
        disconect();
    }
    
    protected void update(T object) {
        conect();
        em.getTransaction().begin();
        em.merge(object);
        em.getTransaction().commit();
        disconect();
    }
    
    protected void delete(T object) {
        conect();
        em.getTransaction().begin();
        em.remove(object);
        em.getTransaction().commit();
        disconect();
    }
    
}
