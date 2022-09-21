package ej9;

public class Main {
    public static void main (String []args) {
        Matematica mat = new Matematica();
        mat.setNum1(Math.random()*10);
        mat.setNum2(Math.random()*10);

        System.out.println(mat.getNum1());
        System.out.println(mat.getNum2());
        System.out.println(mat.calcularPotencia());
        System.out.println(mat.calcularRaiz());
        System.out.println(mat.devolverMayor());

    }
}