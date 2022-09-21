package ej4;

public class Rectangulo {
    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double superficie(){
        return base*altura;
    }
    public Double perimetro(){
        return (base+altura)*2;
    }
    public void draw(){
        for (int i = 0 ; i < altura.intValue() ; i++){
            for (int j = 0 ; j < base.intValue() ; j++){
                if (i > 0 && j > 0  && i < altura.intValue()-1 && j < base.intValue()-1) System.out.print("   ");
                else System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
