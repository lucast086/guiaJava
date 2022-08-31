package ejAprendizaje;

import java.util.Random;

public class ej19 {
    public static void main (String[] args){

        //int[][] matriz = new int[4][4];
        //int[][] transp = new int[4][4];

        //genero matriz para caso positivo
        int[][] transp = new int[3][3];
        int[][] matriz = {{0,-2,4},{2,0,2},{-4,-2,0}};
        transpuesta(matriz,transp);
        System.out.println("matriz original");
        mostrarMatriz(matriz);
        System.out.println("matriz transpuesta");
        mostrarMatriz(transp);


        System.out.println("Antisimetrica: "+ Isantisimetric(matriz,transp));

    }

    static boolean Isantisimetric(int[][] m,int[][] t){
        boolean as = true;
            for (int i = 0 ; i < m.length; i++){
                for (int j = 0 ; j < m[i].length; j++){
                    if (t[i][j] != -1* m[i][j]) as= false;
                }

            }
            return as;
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
