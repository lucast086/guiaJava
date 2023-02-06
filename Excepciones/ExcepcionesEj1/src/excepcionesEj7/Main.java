/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesEj7;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("CLASS 1");
        
        System.out.println("System.out.println(”Valor final del try:” + valor) ;   ESTOY IMPRIME valor final del try: 44");
        System.out.println("lo del catch no se ejecuta porque no se captura excepcion");
        System.out.println("System.out.println(”Valor final del finally: ” + valor) ;  ESTA LINEA IMPRIME valor final del finally: 45");
        System.out.println("System.out.println(”Valor antes del return: ” + valor) ; ESTA LINEA IMPRIME valor antes del return: 46");
        System.out.println("System.out.println (metodo()) ; ESTO IMPRIME 46");
        
        
        System.out.println("");
        System.out.println("CLASS 2");
        System.out.println("System.out.println(”Valor final del catch: ” + valor) ; linea del catch, que imprime VALOR FINAL DEL CATCH 43");
        System.out.println("System.out.println(”Valor final del finally: ” + valor) ; esto imprime el finally : valor final del finally 44");
        System.out.println("System.out.println(”Valor antes del return: ” + valor) ; esto es luego del bloque try: valor antes del return 45");
        System.out.println("ESTO SE IMPÑRIME DESDE EL MAIN:   45");
        
        System.out.println("");
        System.out.println("CLASS 3");
        System.out.println("System.err.println(”Excepcion en metodo ( ) ” ) ;    esto se imprime porque se produce una excepcion que lelva al bloque catch, y luego en este bloque se produce otra excepcion"
                + "que no esta en un bloque try, por lo que esta excepcion va a parar al catch mas cercano, que seria el cach del main. "
                + "y por eso se imprime esto:  Excepcion en mtodo()");
        System.out.println("tambien imprime: EL TRACK DE EXCEPCIONES OCURRIDAS.");
        
    }

}

class Uno {

    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("42");
            valor = valor + 1;
            System.out.println("Valor final del try :" + valor);
        } catch (NumberFormatException e) {

            valor = valor + Integer.parseInt("42");
            System.out.println("Valor final del catch  :" + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor
            );
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }

    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println(
                    "Excepcion en metodo() ");
            e.printStackTrace();
        }
    }
}
