/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaej4;

/**
 *Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 * @author lucas
 */
public class Circulo implements calculosFormas {
    
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    

    @Override
    public Double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public Double calcularPerimetro() {
        return PI * (radio*2);
    }
    
}
