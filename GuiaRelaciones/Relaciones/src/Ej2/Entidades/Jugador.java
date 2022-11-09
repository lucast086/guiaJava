package Ej2.Entidades;

public class Jugador {
    private Integer id;
    private String nombre;
    private boolean isMojado;

    public Jugador(Integer id, String nombre, boolean isMojado) {
        this.id = id;
        this.nombre = nombre;
        this.isMojado = isMojado;
    }

    public Jugador() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return isMojado;
    }

    public void setMojado(boolean mojado) {
        isMojado = mojado;
    }

    public boolean disparo(Revolver r){
        boolean shoot = r.mojar();
        if (shoot) {
            this.isMojado = true;
        } else r.siguienteChorro();
        return shoot;
    }


}
