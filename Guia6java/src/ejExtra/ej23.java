package ejExtra;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import org.javatuples.*;

public class ej23 {
    public static void main (String[] args) {
        int tamMatriz = 20;
        String[][] sopa = new String[tamMatriz][tamMatriz];
        llenarMatriz(sopa);
        AddWord(sopa);
        mostrarMatriz(sopa);
    }
    // funcion que cargue la matriz con las palabras ingresadas por el usuario
    static void AddWord(String[][] m){
        Scanner leer = new Scanner(System.in);
        int p1 = -1, p2 = -1;

        int maxPal = 5;
        Random r = new Random();
        int[] posicionesUsadas = {-1,-1,-1,-1,-1};

        for (int i = 0; i < maxPal ; i++){
            System.out.println("Ingrese la palabra "+(i+1)+" para la sopa");
            String palabra = leer.next();
            if (Isvalid(palabra)){
                do {
                    p1 = r.nextInt(0, 20);
                    p2 = r.nextInt(0, 20);
                    System.out.println(" c1 "+p1+" c2 "+p2);
                    //BUCLE ININITO ACA
                } while((p2 >= 20 - palabra.length()) || isUsed(p1, posicionesUsadas));
                    posicionesUsadas[i] = p1;
                    insertWord(m,palabra,p1,p2);

                    //generar una posicion aleatoria, verificar que no haya usado ya esa fila, luego insertar la palabra
            } else {
                System.out.println(" ");
                System.out.println("PALABRA NO VALIDA");
                System.out.println(" ");
                i--;
            }
        }
    }

    private static boolean isUsed(int x, int[] ar) {
        for (int i: ar) {
            if (i == x) return true;
        }
        return false;

    }

    // dada una matriz un par de coordenadas y una palabra, lo que haces es insertar esa palabra a partir de las coordenadas dadas.
    static void insertWord (String[][] m, String pl,int pos1, int pos2){
        int j = pos2;
            for (int k = 0; k < pl.length() ; k++){
                m[pos1][j] = pl.substring(k,k+1);
                j++;
            }
    }


    //funcion que verifique si la palabra es valida
    //la palabra es valida si tiene 3,4,5 como longitud
    static boolean Isvalid (String f){
        if (f.length() >= 3 && (f.length() <= 5)) return true;
        return false;
    }

    //funcion que imprima una matriz
    static void mostrarMatriz(String[][]m){
        for (int i = 0 ; i < m.length; i++){
            for (int j = 0 ; j < m[i].length; j++){
                System.out.print(" | "+m[i][j]+" | ");
            }
            System.out.println("");
        }
    }
    //funcion que rellene espacios en blanco de una matriz con numeros
    //en realidad voy a llenar primero toda la matriz con numeros y luego posicionar las palabras en otra funcion.
    static void llenarMatriz (String[][]m){
        Random r = new Random();
        for (int i = 0 ; i < m.length; i++){
            for (int j = 0 ; j < m[i].length; j++){
                m[i][j] = ((Integer) r.nextInt(1,10)).toString();
            }
        }
    }
}
