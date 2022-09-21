package ej2;

public class Circunferencia {

    private Double radio;

    public Circunferencia() {
    }

    public Circunferencia(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double perimetro (){
        return (2* Math.PI*radio);
    }
    public Double area (){
        return (Math.PI * Math.pow(radio,2));
    }


}
