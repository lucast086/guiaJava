package ej9;

public class Matematica {
    private double num1;
    private double num2;

    public Matematica() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double devolverMayor(){
        return Math.max(this.num1,this.num2);
    }

    public double calcularPotencia(){
        long max = Math.round(devolverMayor());
        long min = Math.round(Math.min(this.num1,this.num2));
                return Math.pow(max,min);
    }
    public double calcularRaiz(){
        double min = Math.min(this.num1,this.num2);
        return Math.sqrt(Math.abs(min));
    }

}
