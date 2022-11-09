package Ej5;

public class Main {
    public static void main (String[] args){
        PaisService paisService = new PaisService();

        paisService.crearPais();
        paisService.mostrarPaises();
        paisService.eliminarPais();
        paisService.mostrarPaises();
    }
}
