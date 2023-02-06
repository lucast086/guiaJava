/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.menu;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Cliente;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.servicios.AutorService;
import libreria.servicios.ClienteService;
import libreria.servicios.EditorialService;
import libreria.servicios.LibroService;
import libreria.servicios.PrestamoService;

/**
 *
 * @author lucas
 */
public class Menu {

    private AutorService autorService;
    private EditorialService editorialService;
    private LibroService libroService;
    private ClienteService clienteService;
    private PrestamoService prestamoService;
    Scanner leer = new Scanner(System.in);

    public Menu() {
        autorService = new AutorService();
        editorialService = new EditorialService();
        libroService = new LibroService();
        prestamoService = new PrestamoService();
        clienteService = new ClienteService();

    }

    // *****  MENU PRINCIPAL ************
    public void menuPrincipal() {
        int opcion = 0;

        do {
            try {
                System.out.println("*****  MENU PRINCIPAL  *****");
                System.out.println("* 1.- Menu Autores         *");
                System.out.println("* 2.- Menu Editoriales     *");
                System.out.println("* 3.- Menu Libros          *");
                System.out.println("* 4.- Menu Prestamos       *");
                System.out.println("* 5.- Menu Clientes        *");
                System.out.println("* 6.- Salir                *");
                System.out.println(" VER TODOS ");
                System.out.println("****************************");

                opcion = Integer.parseInt(leer.nextLine());

                switch (opcion) {
                    case 1:
                        menuAutores();
                        break;
                    case 2:
                        menuEditoriales();
                        break;
                    case 3:
                        menuLibros();
                        break;
                    case 4:
                        menuPrestamos();
                        break;
                    case 5:
                        menuClientes();
                        break;
                    case 6:
                        System.out.println("ADIOS");
                        break;
                         case 7:
                        menuTodos();
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("OPCION INVALIDA");
                leer.next();
            }
        } while (opcion != 6);

    }
    
    // ***** MENU SECUNDARIOS  ************

    private void menuAutores() {
        int opcion = 0;

        do {
            try {
                System.out.println("********  MENU AUTORES  ********");
                System.out.println("* 1.- Crear Autor              *");
                System.out.println("* 2.- Modificar Autor          *");
                System.out.println("* 3.- Borrar Autor             *");
                System.out.println("* 4.- Buscar Autor por Nombre  *");
                System.out.println("* 5.- Menu Principal           *");
                System.out.println("********************************");

                opcion = Integer.parseInt(leer.nextLine());

                switch (opcion) {
                    case 1:
                        menuCreacionA();
                        break;
                    case 2:
                        menuModA();
                        break;
                    case 3:
                        menuBorrarA();
                        break;
                    case 4:
                        menuBuscarAutor();
                        break;
                    case 5:
                        System.out.println("Volviendo...");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("OPCION INVALIDA");
                leer.next();
            }
        } while (opcion != 5);
    }

    private void menuEditoriales() {
        int opcion = 0;

        do {
            try {
                System.out.println("******  MENU EDITORIALES  ******");
                System.out.println("* 1.- Crear Editorial          *");
                System.out.println("* 2.- Modificar Editorial      *");
                System.out.println("* 3.- Borrar Editorial         *");
                System.out.println("* 4.- Buscar Editorial         *");
                System.out.println("* 5.- Menu Principal           *");
                System.out.println("********************************");

                opcion = Integer.parseInt(leer.nextLine());

                switch (opcion) {
                    case 1:
                        menuCreacionE();
                        break;
                    case 2:
                        menuModE();
                        break;
                    case 3:
                        menuBorrarE();
                        break;
                    case 4:
                        menuBuscarE();
                        break;
                    case 5:
                        System.out.println("Volviendo...");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("OPCION INVALIDA");
                leer.next();
            }
        } while (opcion != 5);
    }

    private void menuLibros() {
        int opcion = 0;

        do {
            try {
                System.out.println("**********  MENU LIBROS  **********");
                System.out.println("* 1.- Crear Libro                 *");
                System.out.println("* 2.- Modificar Libro             *");
                System.out.println("* 3.- Borrar Libro                *");
                System.out.println("* 4.- Buscar Libro por Titulo     *");
                System.out.println("* 5.- Buscar Libro por Autor      *");
                System.out.println("* 6.- Buscar Libro por Editorial  *");
                System.out.println("* 7.- Menu Principal              *");
                System.out.println("************************************");

                opcion = Integer.parseInt(leer.nextLine());

                switch (opcion) {
                    case 1:
                        menuCreacionL();
                        break;
                    case 2:
                        menuModL();
                        break;
                    case 3:
                        menuBorrarL();
                        break;
                    case 4:
                        menuBuscarLT();
                        break;
                    case 5:
                        menuBuscarLA();
                        break;
                    case 6:
                        menuBuscarLE();
                        break;
                    case 7:
                        System.out.println("ADIOS");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("OPCION INVALIDA");
                leer.next();
            }
        } while (opcion != 7);
    }

    private void menuPrestamos() {
        int opcion = 0;

        do {
            try {
                System.out.println("*********  MENU PRESTAMOS  *********");
                System.out.println("* 1.- Prestar Libro                *");
                System.out.println("* 2.- Devolver Libro               *");
                System.out.println("* 3.- Buscar Prestamos por Cliente  *");
                System.out.println("* 4.- Menu Principal               *");
                System.out.println("************************************");

                opcion = Integer.parseInt(leer.nextLine());

                switch (opcion) {
                    case 1:
                        menuPrestar();
                        break;
                    case 2:
                        menuDevolver();
                        break;
                    case 3:
                        menuBuscarP();
                        break;
                    case 4:
                        System.out.println("Volviendo...");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("OPCION INVALIDA");
                leer.next();
            }
        } while (opcion != 4);
    }

    private void menuClientes() {
        int opcion = 0;

        do {
            try {
                System.out.println("******  MENU CLIENTES  ******");
                System.out.println("* 1.- Crear Cliente         *");
                System.out.println("* 2.- Modificar Cliente     *");
                System.out.println("* 3.- Borrar Cliente        *");
                System.out.println("* 4.- Buscar Cliente        *");
                System.out.println("* 5.- Menu Principal        *");
                System.out.println("*****************************");

                opcion = Integer.parseInt(leer.nextLine());

                switch (opcion) {
                    case 1:
                        menuCreacionC();
                        break;
                    case 2:
                        menuModC();
                        break;
                    case 3:
                        menuBorrarC();
                        break;
                    case 4:
                        menuBuscarCliente();
                        break;
                    case 5:
                        System.out.println("Volviendo...");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("OPCION INVALIDA");
                leer.next();
            }
        } while (opcion != 5);
    }
    
    
    
    // *****  METODOS DE LOS MENUS ************
    
    /* me falta ver la validacion de datos
    y pedir los datos al usuario
    luego usar los services para completar todos los pasos.
    puedo ver de crear un paquete de excepciones donde pueda crear mis propias
    excepciones,
     */
    private void menuCreacionA() {
        try {
            System.out.println("Ingrese el Nombre del autor");
            String nombre = leer.nextLine();
            if (nombre.isBlank()) {
                throw new InputMismatchException();
            }
            autorService.crearAutor(nombre);
            System.out.println("Autor Creado ");
        } catch (InputMismatchException e) {
            System.out.println("Nombre no valido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void menuModA() {
        try {
            System.out.println("Ingrese el ID del autor a modificar");
            Integer id = Integer.parseInt(leer.nextLine());
            System.out.println("Ingrese el Nuevo nombre del autor");
            String nombre = leer.nextLine();
            if (nombre.isBlank()) {
                throw new InputMismatchException();
            }
            autorService.modificarAutor(id, nombre);
            System.out.println("Autor Modificado ");
        } catch (InputMismatchException e) {
            System.out.println("Nombre no valido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void menuBorrarA() {
        try {
            System.out.println("Ingrese el ID del autor a borrar");
            Integer id = Integer.parseInt(leer.nextLine());
            autorService.borrarAutor(id);
            System.out.println("Autor Borrado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void menuBuscarAutor() {
        List<Autor> autores = new ArrayList();
        try {
            System.out.println("Ingrese el nombre del autor");
            String nombre = leer.nextLine();
            if (nombre.isBlank()) {
                throw new InputMismatchException();
            }

            autores = autorService.encontrarXnombre(nombre);

            for (Autor a : autores) {
                System.out.println(a.toString());
            }
        } catch (InputMismatchException e) {
            System.out.println("Nombre no valido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void menuCreacionE() {
        try {
            System.out.println("Ingrese el Nombre de la Editorial");
            String nombre = leer.nextLine();
            if (nombre.isBlank()) {
                throw new InputMismatchException();
            }
            editorialService.crearEditorial(nombre);
            System.out.println("Editorial Creada ");
        } catch (InputMismatchException e) {
            System.out.println("Nombre no valido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void menuModE() {
        try {
            System.out.println("Ingrese el ID de la editorial a modificar");
            Integer id = Integer.parseInt(leer.nextLine());
            System.out.println("Ingrese el Nuevo nombre de la editorial");
            String nombre = leer.nextLine();
            if (nombre.isBlank()) {
                throw new InputMismatchException();
            }
            editorialService.modificarEditorial(id, nombre);
            System.out.println("Editorial Modificada ");
        } catch (InputMismatchException e) {
            System.out.println("Nombre no valido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void menuBorrarE() {
        try {
            System.out.println("Ingrese el ID del editorial a borrar");
            Integer id = Integer.parseInt(leer.nextLine());
            editorialService.borrarEditorial(id);
            System.out.println("editorial Borrado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void menuBuscarE() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

// SEGUIR DE ACA
    
//FALTA CONTROLAR QUE EXISTA EL AUTOR Y LA EDITORIAL PARA EVITAR QUE SEAN NULOS
    private void menuCreacionL() {
        try {
            System.out.println("Ingrese el Nombre del Libro");
            String nombre = leer.nextLine();
            if (nombre.isBlank()) {
                throw new InputMismatchException();
            }
            System.out.println("Ingrese el Año");
            Integer anio = Integer.parseInt(leer.nextLine());

            System.out.println("Ingrese Cantidad de Ejemplares");
            Integer ejemplares = Integer.parseInt(leer.nextLine());

            Integer ejemplaresP = 0;
            Integer ejemplaresR = ejemplares;

            System.out.println("Ingrese el Id de autor");
            Integer autorId = Integer.parseInt(leer.nextLine());
            System.out.println("Ingrese el Id de Editorial");
            Integer editorialId = Integer.parseInt(leer.nextLine());
            Autor autor = autorService.encontrarId(autorId);
            Editorial editorial = editorialService.encontrarId(editorialId);

            libroService.crearLibro(nombre, anio, ejemplares, ejemplaresP, ejemplaresR, true, autor, editorial);
            System.out.println("Libro Creado ");
        } catch (InputMismatchException e) {
            System.out.println("Nombre no valido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void menuModL() {
        try {
            System.out.println("Ingrese el ID del Libro a modificar");
            Long id = Long.parseLong(leer.nextLine());

            System.out.println("Ingrese el Nombre del Libro");
            String nombre = leer.nextLine();
            if (nombre.isBlank()) {
                throw new InputMismatchException();
            }
            System.out.println("Ingrese el Año");
            Integer anio = Integer.parseInt(leer.nextLine());

            System.out.println("Ingrese Cantidad de Ejemplares");
            Integer ejemplares = Integer.parseInt(leer.nextLine());

            System.out.println("Ingrese el Cantidad de Ejemplares Prestados");
            Integer ejemplaresP = Integer.parseInt(leer.nextLine());

            System.out.println("Ingrese el Cantidad de Ejemplares Restantes");
            Integer ejemplaresR = Integer.parseInt(leer.nextLine());

            System.out.println("Ingrese el Cantidad de Ejemplares Restantes");
            Integer autorId = Integer.parseInt(leer.nextLine());

            System.out.println("Ingrese el Cantidad de Ejemplares Restantes");
            Integer editorialId = Integer.parseInt(leer.nextLine());

            Autor autor = autorService.encontrarId(autorId);
            Editorial editorial = editorialService.encontrarId(editorialId);

            libroService.modificarLibro(id, nombre, anio, ejemplares, ejemplaresP, ejemplaresR, true, autor, editorial);
            System.out.println("Libro Modificado");
        } catch (InputMismatchException e) {
            System.out.println("Nombre no valido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void menuBorrarL() {
        try {
            System.out.println("Ingrese el ID del Libro a borrar");
            Long id = Long.parseLong(leer.nextLine());
            libroService.borrarLibro(id);
            System.out.println("Libro Borrado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void menuBuscarLT() {
        List<Libro> libros = new ArrayList();
        try {
            System.out.println("Ingrese el nombre del libro");
            String nombre = leer.nextLine();
            if (nombre.isBlank()) {
                throw new InputMismatchException();
            }

            libros = libroService.encontrarXtitulo(nombre);

            for (Libro l : libros) {
                System.out.println(l.toString());
            }
        } catch (InputMismatchException e) {
            System.out.println("Nombre no valido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void menuBuscarLA() {
        List<Libro> libros = new ArrayList();
        try {
            System.out.println("Ingrese el Id del Autor");
            Integer id = Integer.parseInt(leer.nextLine());

            Autor autor = autorService.encontrarId(id);
            libros = libroService.encontrarXautor(autor);

            for (Libro l : libros) {
                System.out.println(l.toString());
            }
        } catch (InputMismatchException e) {
            System.out.println("Nombre no valido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void menuBuscarLE() {
        List<Libro> libros = new ArrayList();
        try {
            System.out.println("Ingrese el Id de la Editorial");
            Integer id = Integer.parseInt(leer.nextLine());

            Editorial editorial = editorialService.encontrarId(id);
            libros = libroService.encontrarXeditorial(editorial);

            for (Libro l : libros) {
                System.out.println(l.toString());
            }
        } catch (InputMismatchException e) {
            System.out.println("Nombre no valido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    

    private void menuBuscarP() {
        System.out.println("INGRESE EL dni del cliente");
        Long dni = Long.parseLong(leer.nextLine());
        Cliente cliente = clienteService.encontrarDni(dni);
        List<Prestamo> prestamos = prestamoService.encontrarXcliente(cliente);
        System.out.println("");
        System.out.println("Estos son los prestamos del cliente " + dni);
        System.out.println("");
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo.toString());
        }
        System.out.println("");
        System.out.println("PRESIONE UNA TECLA PARA CONTINUAR");
        leer.nextLine();
    }

    /* tendria que ver si sucede ams de una ocurrencia
    por ejemplo si un lciente lleva 2 ejemplares del mismo libro, en la misma fecha.
    
    
    VER SI LAS FECHAS SE GENERAN LA DEL DIA DE HOY AL CREAR EL OBJETO DATE()
    */
    private void menuDevolver() {
        try {
        System.out.println("Ingrese el isbn del libro a devolver");
        Long isbn = Long.valueOf(leer.nextLine());
        System.out.println("Ingrese el dni del cliente");
        Long dni = Long.valueOf(leer.nextLine());
        
        prestamoService.devolucion(isbn,dni);
            System.out.println("libro devuelto con exito");
        } catch (Exception e) {
            System.out.println("ERROR EN LA DEVOLUCION: "+e.getMessage());
        }
        /* 
        buscar por el titulo del libro y ubicar el prestamo.
        asignar fecha del dia como fecha de devolucion.
        
         */
    }

    //1
    private void menuPrestar() {
        try {
            System.out.println("Ingrese el dni del cliente");
            Long dni = Long.parseLong(leer.nextLine());
            Cliente cliente = clienteService.encontrarDni(dni);
            //tiene sentido este if? o ya alcanza el control anterior
            if (cliente.equals(null)) throw new Exception("Cliente no existe");
            
            System.out.println("Ingrese el isbn del Libro");
            Long isbn = Long.parseLong(leer.nextLine());
            Libro libro = libroService.encontrarId(isbn);
            if (libro.getEjemplaresRestantes() <= 0) throw new Exception("No hay mas ejemplares");
            
            Date fechaPrest = new Date();
            Date fechaDevol = null;
            
            prestamoService.crearPrestamo(fechaPrest,fechaDevol,libro,cliente);
            int eP = libro.getEjemplaresPrestados()+1;
            int eR = libro.getEjemplaresRestantes()-1;
            
            libroService.modificarLibro(isbn, libro.getTitulo(),libro.getAnio(),libro.getEjemplares(),
                    eP, eR, libro.getAlta(),libro.getAutor(),libro.getEditorial());
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }
        /* 
        verificar que el cliente exista por dni  --
        verificar que el libro exista  --
        verificar que la cantidad de ejemplares restantes sea mayor que 0 --
        
        poner la fecha del dia como fecha de prestamo  --
        y la fecha de devolucion como null  -- 
        reducir en 1 la cantidad de ejemplares restantes  --
        subir en 1 la cantidad de ejemplares prestados  --
        
        crear prestamo con esos datos
         */
    }

    private void menuBuscarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void menuBorrarC() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void menuModC() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void menuCreacionC() {
        try {
            System.out.println("Ingrese el Nombre del Cliente");
            String nombre = leer.nextLine();
            if (nombre.isBlank()) {
                throw new InputMismatchException();
            }
            System.out.println("Ingrese el Apellido del Cliente");
            String apellido = leer.nextLine();
            if (apellido.isBlank()) {
                throw new InputMismatchException();
            }
            System.out.println("Ingrese el dni del Cliente");
            Long dni = Long.parseLong(leer.nextLine());

            System.out.println("Ingrese el Telefono del Cliente");
            String telefono = leer.nextLine();
            if (telefono.isBlank()) {
                throw new InputMismatchException();
            }

            Cliente cliente = clienteService.crearCliente(dni, nombre, apellido, telefono);
            System.out.println("Cliente Creado ");
        } catch (InputMismatchException e) {
            System.out.println("Nombre no valido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void menuTodos() {
        //METODO PARA VER TODOS PARA PRUEBAS PERO NO SE SI LO VOY A HACER
    }

}
