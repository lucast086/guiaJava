/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import libreria.control.PrestamoController;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;

/**
 *
 * @author lucas
 */
public class PrestamoService {

    private PrestamoController pC;

    public PrestamoService() {
        pC = new PrestamoController();

    }

    public Prestamo crearPrestamo(Date fechaPrest, Date fechaDevol, Libro libro, Cliente cliente) {
        try {
            Prestamo c = new Prestamo(null, fechaPrest, fechaDevol, libro, cliente);
            pC.crear(c);
            return c;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return null;
        }
    }

    public Boolean modificarPrestamo(Integer id, Date fechaPrest, Date fechaDevol, Libro libro, Cliente cliente) {
        try {
            Prestamo p = encontrarId(id);
            p.setFechaPrestamo(fechaPrest);
            p.setFechaDevolucion(fechaDevol);
            p.setLibro(libro);
            p.setCliente(cliente);
            pC.editar(p);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean borrarPrestamo(Integer id) {
        try {
            pC.borrar(id);
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }

    public List<Prestamo> encontrarXcliente(Cliente cliente) {
        List<Prestamo> prestamos = new ArrayList<>();
        try {
            prestamos = pC.findXcliente(cliente);
        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
        } finally {
            return prestamos;
        }
    }

    public Prestamo encontrarId(Integer id) {
        try {
            Prestamo prestamo = pC.findId(id);
            return prestamo;
        } catch (Exception e) {
            return null;
        }
    }

    /* 
    No generar condiciones inválidas. Por ejemplo, no se debe permitir prestar más
ejemplares de los que hay, ni devolver más de los que se encuentran prestados.
No se podrán prestar libros con fecha anterior a la fecha actual, etc.
     */
    //actua sobre el primer elemento encontrado con esas caracteristicas.
    public List<Prestamo> encontrarXlibroYcliente(Long isbn, Long dni) {
        List<Prestamo> prestamos = new ArrayList<>();
        LibroService lS = new LibroService();
        ClienteService cS = new ClienteService();
        
        try {
            
            Libro libro = lS.encontrarId(isbn);
            Cliente cliente = cS.encontrarDni(dni);
            
            prestamos = pC.findLibroCliente(libro,cliente);

            if (prestamos.isEmpty()) {
                throw new Exception("no se encontro el prestamo");
            }

            return prestamos;

            //sino tengo que tomar el primer elemnto y tratarlo.
            // obtengo el isbn del libro, lo busco en la base y 
        } catch (Exception e) {
            System.out.println("error encontrando prestamo por libro y cliente");
            return null;
        }
    }

    public Boolean devolucion(Long isbn, Long dni) {
        try {
            List<Prestamo> prestamos = new ArrayList<>();
            LibroService lS = new LibroService();
            Libro l;
            Prestamo p;

            prestamos = encontrarXlibroYcliente(isbn, dni);
            p = prestamos.get(0);
            l = p.getLibro();
            Date fechaDevol = new Date();

            modificarPrestamo(p.getId(), p.getFechaPrestamo(), fechaDevol, l, p.getCliente());

            lS.modificarLibro(l.getIsbn(), l.getTitulo(), l.getAnio(), l.getEjemplares(),
                    l.getEjemplaresPrestados() - 1, l.getEjemplaresRestantes() + 1, l.getAlta(), l.getAutor(), l.getEditorial());

            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
}