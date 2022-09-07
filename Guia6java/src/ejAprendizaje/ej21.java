package ejAprendizaje;
import org.javatuples.*;
import java.util.Random;

public class ej21 {
    public static void main (String[] args){
        // GENERO MATRICES CON NUMEROS ALEATORIOS
        int[][] m3 = new int[3][3];
        int[][] m10 = new int[10][10];
        llenarMatriz(m3);
        llenarMatriz(m10);

        //***********************
        //caso de prueba positivo
        //int[][] m3 = {{1,2,3},{2,3,4},{3,4,5}};
        //int[][] m3 = {{7,8,9},{8,9,10},{9,10,11}};
        //int[][] m3 = {{14,15,16},{15,16,17},{16,17,18}};
        //int[][] m10 = new int[10][10];
        //llenarMatrizPosi(m10);
        //fin caso prueba positivo
        //************************

        System.out.println("matriz de 3 x 3");
        mostrarMatriz(m3);
        System.out.println("");
        System.out.println("matriz de 10 x 10");
        mostrarMatriz(m10);
        System.out.println("");
        System.out.println(" La submatriz se encuentra en la posicion inicial "+verifica(m10,m3));

    }

    //esta funcion retorna una tupla con las coordenadas de la ocurrencia, si retorna -1 -1 es porque no hubo ocurrencia
    static Pair<Integer,Integer> verifica(int[][] mG,int[][] mC){
        //donde se va a alojar la submatrices obtenidas
        int[][] subM = new int[mC.length][mC.length];
        //coordenadas de la primer ocurrencia de igualdad, si no se encuentra devuelve -1 -1
        int k = -1,l = -1;
        //control para romper el ciclo ante la priemr ocurrencia de igualdad
        boolean eq = false;
        for (int i = 0 ; i < mG.length-mC.length+1; i++){
            for (int j = 0 ; j < mG[i].length-mC.length+1 ; j++){
                //si el primer elemento de mi matriz coinicide con un elemento de la matriz grande, busco la submatriz.
                if (mG[i][j] == mC[0][0]) {
                    //obtengo submatriz
                    subMatriz(mG,subM,i,j);
                    //comparo matriz y sub martiz
                    eq = equalsM(mC,subM);
                    //si son iguales obtengo posiciones y ermino ciclo
                    if (eq) {
                        k = i;
                        l = j;
                        break; //termino el segundo for
                    }
                    //si las matrices son iguales genero una tupla con las posiciones i y j.
                    //si no son iguales sigo iterando.
                }
            }
            if (eq) break; //cuando se da la primer ocurrencia termino el primer for
        }
        //devuelvo la tupla con las coordenadas
        Pair<Integer,Integer> coord = new Pair<>(k,l);
    return coord;
    }

    // esta funcion compara 2 matrices, retorna verdadero si son iguales
    static boolean equalsM(int[][] mC,int[][] sub){
        boolean e = true;
        for (int i = 0 ; i < sub.length ; i++){
            for (int j = 0 ; j < sub[i].length ; j++){
                if (sub[i][j] != mC[i][j]) e = false; //si encuentro un elemento desigual, retorno falso
            }
        }
        return e;
    }
    //esta funcion genera una submatriz a partir de una matriz de mayor tamaño y la muestra,
    /**
     * @param sub submatriz obtenia a partir de la matriz grande
     * @param mG  matriz grande, de la cual se obtiene la sub
     * @param f contiene la posicion inical de la fila
     * @param c contiene la posicion inicial de la columna,
     *
    **/
    static void subMatriz(int[][] mG,int[][] sub, int f,int c){
        for (int i = 0 ; i < sub.length ; i++){
            for (int j = 0 ; j < sub[i].length ; j++){
                sub[i][j] = mG[f+i][c+j];
            }
        }
        System.out.println(" ------  ------  ------");
        mostrarMatriz(sub);
        System.out.println(" ------  ------  ------");

    }

// genera una matriz con numeros random
    static void llenarMatriz (int[][]m){
            Random r = new Random();
            for (int i = 0 ; i < m.length; i++){
                for (int j = 0 ; j < m[i].length; j++){
                    m[i][j] = r.nextInt(1,10);
                }
            }
        }

        // muestra por consola una matriz
    static void mostrarMatriz(int[][]m){
        for (int i = 0 ; i < m.length; i++){
            for (int j = 0 ; j < m[i].length; j++){
                if (m[i][j] < 10) System.out.print(" | "+m[i][j]+" |  ");
                else System.out.print(" | "+m[i][j]+" | ");
            }
            System.out.println(" ");
        }
    }
    // FUNCION PARA PRUEBAS
    // llena una matriz para el caso positivo.
    static void llenarMatrizPosi (int[][]m){
        for (int i = 0 ; i < m.length; i++){
            for (int j = 0 ; j < m[i].length; j++){
                m[i][j] = i+j;
            }
        }
    }
}
