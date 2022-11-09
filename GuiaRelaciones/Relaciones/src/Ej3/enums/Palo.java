package Ej3.enums;

public enum Palo {
    ESPADA("Espada"),
    BASTO("Basto"),
    COPA("Copa"),
    ORO("Oro");

    final String name;
    private Palo(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Palo= " + name;
    }
}
