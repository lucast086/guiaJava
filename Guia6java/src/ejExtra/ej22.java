package ejExtra;

import java.util.Random;

public class ej22 {
    public static void main (String[] args){
        //lo hago local al n y al m para no pedirle al usuario,
        int n = 8;
        int m = 9;
        int[][] matriz = new int[n][m];
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
    }
    static void mostrarMatriz(int[][]m){
        for (int i = 0 ; i < m.length; i++){
            for (int j = 0 ; j < m[i].length; j++){
                System.out.print(" | "+m[i][j]+" | ");
            }
            System.out.println("");
        }
    }

    static void llenarMatriz (int[][]m){
        Random r = new Random();
        for (int i = 0 ; i < m.length; i++){
            for (int j = 0 ; j < m[i].length; j++){
                m[i][j] = r.nextInt(1,10);
            }
        }
    }
}
