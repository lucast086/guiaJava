package ejExtra4;

public class Nif {
    private long dni;
    private String nif;

    public Nif() {
    }

    public Nif(long dni, String nif) {
        this.dni = dni;
        this.nif = nif;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Nif{" +
                "dni= " + dni +
                ", nif= '" + nif + '\'' +
                '}';
    }
}
