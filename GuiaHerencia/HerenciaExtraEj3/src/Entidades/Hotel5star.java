/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enums.Gimnasio;

/**
 *
 * @author lucas
 */
public class Hotel5star extends Hotel4star {
    private int cantSalonesConferencia;
    private int cantSuites;
    private int cantLimosinas;

    public Hotel5star() {
    }

    public Hotel5star(int cantSalonesConferencia, int cantSuites, int cantLimosinas, String restaurante, int capcidadRestaurante, Gimnasio gym, int cantHabitaciones, int numCamas, int cantPisos, String nombre, String direccion, String localidad, String gerenteEncargado) {
        super(restaurante, capcidadRestaurante, gym, cantHabitaciones, numCamas, cantPisos, nombre, direccion, localidad, gerenteEncargado);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }



    public int getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(int cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }
  /*  
    @Override
    public float precioHabitacion() {
        
        return super.precioHabitacion() + valorAgregadoXlimosina();
    }

    private float valorAgregadoXlimosina() {
        int valorXlimo = 15;
        return this.cantLimosinas * valorXlimo;
    }
*/
    @Override
    public String toString() {
        return "Hotel5star { "+super.toString() + "cantSalonesConferencia=" + cantSalonesConferencia + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }
    
    
}
