package ejAprendizaje;

public class ej15 {
    public static void main (String[] args){

        int ar[] = new int[100];

        for (int i = 0 ; i < ar.length ; i++){
            ar[i] = i+1;
        }
        for (int i : ar) {
            System.out.println(i);
        }


    }
}
