package ej5.entidades;

public class Cuenta {
    // 1 ATRIBUTOS
    private Long numeroCuenta;
    private Long dniCliente;
    private Double saldoActual;
    private Double interes;

    // 2 CONSTRUCTORES
    public Cuenta() {
    }

    public Cuenta(Long numeroCuenta, Long dniCliente, Double saldoActual, Double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    //3 METODOS

    public Long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(Long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public Double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(Double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", dniCliente=" + dniCliente +
                ", saldoActual=" + saldoActual +
                ", interes=" + interes +
                '}';
    }
}
