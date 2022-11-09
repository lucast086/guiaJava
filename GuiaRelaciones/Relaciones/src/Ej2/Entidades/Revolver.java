package Ej2.Entidades;

public class Revolver {
    private Integer posicionActual;
    private Integer posicionAgua;

    public Revolver() {
    }

    public Revolver(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void llenarRevolver(){
        posicionActual = (int) ((Math.random() * 6) + 1);
        posicionAgua = (int) (Math.random()*6 +1);
    }
    public boolean mojar(){
        return (posicionActual == posicionAgua);
    }
    public void siguienteChorro(){
        if (posicionActual == 6) posicionActual =1;
        else  posicionActual++;
    }

    @Override
    public String toString() {
        return "Revolver{" +
                "posicionActual= " + posicionActual +
                ", posicionAgua= " + posicionAgua +
                '}';
    }
}
