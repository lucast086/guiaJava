package ejAprendizaje;

import java.util.Scanner;

public class ej14 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el monto");
        double euros = leer.nextDouble();
        System.out.println("ingrese la moneda Libra - Dolar - Yen");
        String  mon = leer.next();        
        convert(euros,mon);
    }
    static void convert(double e,String m){
        if (m.equalsIgnoreCase("Libra")) System.out.println(e+" euros equivalen a "+(e*0.86)+" Libras");
        else if (m.equalsIgnoreCase("Dolar")) {
            System.out.println(e+" euros equivalen a "+(e*1.28611)+" Dolares");
        } else if (m.equalsIgnoreCase("Yen")) {
            System.out.println(e+" euros equivalen a "+(e*129.852)+" Yenes");
        }
    }
}
