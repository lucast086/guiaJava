package ejExtra;

public class ej2 {
    // b = c     c = a   a = d   d = b
    public static void main (String[]args){
        int A=2, B=4, C=6,D=8;

        System.out.println("Valores iniciales: A = "+A+" B = "+B+" C = "+C+" D = "+D);
        int aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;
        System.out.println("Valores finales: A = "+A+" B = "+B+" C = "+C+" D = "+D);
    }
}
