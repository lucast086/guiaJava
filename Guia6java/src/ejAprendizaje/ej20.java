package ejAprendizaje;

import java.util.Random;
import java.util.Scanner;

public class ej20 {
    public static void main (String[] args) {

        int[][] matriz = new int[3][3];
        llenarMatriz(matriz);
        System.out.println("MATRIZ");
        mostrarMatriz(matriz);
        System.out.println("la matriz es magica: "+IsMagic(matriz));
    }
    static boolean IsMagic(int[][] m){
        boolean as = true;
        //array de resultados
        int[] result = new int[m.length*2+2];

        int k = 0;
        for (int i = 0 ; i < m.length; i++){
            for (int j = 0 ; j < m[i].length; j++){

                result[k] += m[i][j];

                result[k+m.length] += m[j][i];
            }
            k++;

            result[m.length*2] += m[i][i];

            result[m.length*2+1] += m[i][m.length-1-i];
        }

        return as;
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
        Scanner leer = new Scanner(System.in);
        for (int i = 0 ; i < m.length; i++){
            for (int j = 0 ; j < m[i].length; j++){
                System.out.println("ingrese un valor para la posicion "+i+" | "+j);
                m[i][j] = leer.nextInt();
            }
        }
        System.out.println("Matriz cargada");
    }
}
