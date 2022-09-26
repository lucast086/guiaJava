package ejExtra3;

import java.util.Scanner;

public class RaicesService {
    static Scanner leer = new Scanner(System.in);

    public RaicesService() {
    }

    public Raices crearRaices() {
        System.out.println("Inserte el valor de a");
        double a = leer.nextDouble();
        System.out.println("Inserte el valor de b");
        double b = leer.nextDouble();
        System.out.println("Inserte el valor de c");
        double c = leer.nextDouble();
        return new Raices(a, b, c);
    }

    public double getDiscriminante(Raices r){
        double b2 = Math.pow(r.getB(),2);
        double x = 4 * r.getA() * r.getC();
        return  b2 - x;
    }
    public boolean tieneRaices(Raices r){
        return (getDiscriminante(r) >= 0);
    }
    public boolean tieneRaiz(Raices r){
        return (getDiscriminante(r) == 0);
    }
    public void obtenerRaices(Raices r){
        if (tieneRaices(r)){

            double bNegativo = -1*r.getB();
            double raizDiscriminante = Math.sqrt(getDiscriminante(r));
            double solucion1 =  (bNegativo + raizDiscriminante) / (2*r.getA());
            double solucion2 =  (bNegativo - raizDiscriminante) / (2*r.getA());
            System.out.println("la Primer solucion posible para la formula cuadratica: "+r.getA()+"x2 "+r.getB()+"x "+r.getC());
            System.out.println("es: "+solucion1);
            System.out.println("");
            System.out.println("la Segunda solucion posible para la formula cuadratica: "+r.getA()+"x2 "+r.getB()+"x "+r.getC());
            System.out.println("es: "+solucion2);
        }
    }
    public void obtenerRaiz(Raices r){
        if (tieneRaiz(r)){
            double solucion = (-1*r.getB()) / 2*r.getA(); // el discriminante es 0 entnces no se calcula el resto de la formula
            System.out.println("la Unica solucion posible para la formula cuadratica: "+r.getA()+"x2 "+r.getB()+"x "+r.getC());
            System.out.println("es: "+solucion);
        }
    }

    public void calcular(Raices r){
        if (tieneRaices(r)){
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else {
            System.out.println("la formula cuadratica: "+r.getA()+"x2 "+r.getB()+"x "+r.getC()+" NO tiene solucion");
        }
    }
}
