/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.ArrayList;
import java.util.List;
import libreria.control.LibroController;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

/**
 *
 * @author lucas
 */
public class LibroService {
    
    private LibroController lC = null;

    public LibroService() {
        lC = new LibroController();
    }
    
    public Libro crearLibro(String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta, Autor autor, Editorial editorial) {
        try {
            Libro a = new Libro(null, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta,  autor, editorial);
            lC.crear(a);
            return a;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return null;
        }
    }

    public Libro modificarLibro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta, Autor autor, Editorial editorial){        try {
            Libro a = lC.findId(isbn);
            a.setTitulo(titulo);
            a.setAnio(anio);
            a.setEjemplares(ejemplares);
            a.setEjemplaresPrestados(ejemplaresPrestados);
            a.setEjemplaresRestantes(ejemplaresRestantes);
            a.setEditorial(editorial);
            a.setAutor(autor);
            lC.editar(a);
            return a;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return null;
        }
    }

    public Boolean borrarLibro(Long id) {
        try {
            lC.borrar(id);
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }

public Libro encontrarId(Long isbn) {
        try {
            Libro libro = lC.findId(isbn);
            return libro;
        } catch (Exception e) {
            System.out.println("estoy en catch de encontrarID libro");
            return null;
        }
    }
    
    public List<Libro> encontrarXtitulo(String titulo) {
        List<Libro> libros = new ArrayList<>();
        try {
            libros = lC.findTitle(titulo);
        } catch (Exception e) {
            System.out.println("ERROR "+e.getMessage());
        } finally {
            return libros;
        }
    }
    
    public List<Libro> encontrarXautor(Autor autor) {
        List<Libro> libros = new ArrayList<>();
        try {
            libros = lC.findAutor(autor.getNombre());
        } catch (Exception e) {
            System.out.println("ERROR "+e.getMessage());
        } finally {
            return libros;
        }
    }
    
    public List<Libro> encontrarXeditorial(Editorial editorial) {
        List<Libro> libros = new ArrayList<>();
        try {
            libros = lC.findEditorial(editorial.getNombre());
        } catch (Exception e) {
            System.out.println("ERROR "+e.getMessage());
        } finally {
            return libros;
        }
    }
    
}
