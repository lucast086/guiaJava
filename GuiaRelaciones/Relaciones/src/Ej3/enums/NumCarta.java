package Ej3.enums;

public enum NumCarta {
    UNO(1),DOS(2),TRES(3),CUATRO(4),CINCO(5),SEIS(6),SIETE(7),DIEZ(10),ONCE(11),DOCE(12);

    private int numero;

    private NumCarta(int i){
        this.numero = i;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "NumCarta= " + numero;
    }
}
