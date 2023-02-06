/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.control;

import java.util.List;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.servicios.ClienteService;

/**
 *
 * @author lucas
 */
public class PrestamoController extends JPAcontroller<Prestamo>{

    public PrestamoController() {
        super();
    }
    
    public void crear(Prestamo prestamo) {
            super.create(prestamo);
    }
        


    public void editar(Prestamo prestamo) {
        super.update(prestamo);
    }

    public void borrar(Integer id) {
       Prestamo prestamo = findId(id);
       super.delete(prestamo);
    }
    
    public Prestamo findId(Integer id) {
        conect();
        Prestamo prestamo = em.find(Prestamo.class, id);
        disconect();
        return prestamo;
 
    }

    public List<Prestamo> findXcliente(Cliente cliente) {
        Integer id = cliente.getId();
        conect();
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p JOIN Cliente c WHERE c.id = :id").setParameter("id",id).getResultList();
        disconect();
        return prestamos;
    }
/*
    public List<Prestamo> findLibroCliente(Long isbn, Long dni) {
        //tengo que encontrar por libro y cliente y que la fecha de devolucion sea null
        conect();
        
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p WHERE p.libro = :isbn AND p.cliente = :dni AND p.fechaDevolucion IS NULL")
                .setParameter("isbn",isbn).setParameter("dni",dni) .getResultList();
        
        disconect();
        return prestamos;
    }
*/
    
       public List<Prestamo> findLibroCliente(Libro libro, Cliente cliente) {
        //tengo que encontrar por libro y cliente y que la fecha de devolucion sea null
        conect();
        
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p WHERE p.libro = :libro AND p.cliente = :cliente AND p.fechaDevolucion IS NULL")
                .setParameter("libro",libro).setParameter("cliente",cliente) .getResultList();
        
        disconect();
        return prestamos;
    }
}
