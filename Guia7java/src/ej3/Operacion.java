package ej3;

public class Operacion {
    private Double numero1;
    private Double numero2;

    public Operacion() {
    }

    public Operacion(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }
    public Double sumar(){
        return numero1+numero2;
    }
    public Double restar(){
        return numero1-numero2;
    }
    public Double multiplicar(){
        if (numero2==0 || numero1==0) {
            System.out.println("ERROR: MULTIPLICANDO POR 0");
            return 0D;
        } else return numero1*numero2;
    }
    public Double dividir(){
        if (numero2==0) {
            System.out.println("ERROR: DIVIDIENDO POR 0");
            return 0D;
        } else return numero1/numero2;
    }
}
