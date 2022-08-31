package ejAprendizaje;

import java.util.Random;

public class ej18 {
    public static void main (String[] args){

        int[][] matriz = new int[4][4];
        int[][] transp = new int[4][4];
        llenarMatriz(matriz);
        transpuesta(matriz,transp);
        System.out.println("matriz original");
        mostrarMatriz(matriz);
        System.out.println("");
        System.out.println("matriz transpuesta");
        mostrarMatriz(transp);
    }
    static void transpuesta (int[][]m,int[][]t){
        for (int i = 0 ; i < m.length; i++){
            for (int j = 0 ; j < m[i].length; j++){
                t[i][j] = m[j][i];
            }

        }
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
