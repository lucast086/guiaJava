/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Cliente extends Persona {
    private int numCliente;
    private ArrayList<Barco> barcos;
    private float saldo;

    public Cliente() {
    }

    public Cliente(int numCliente, ArrayList<Barco> barcos, float saldo, String nombre, String apellido, int edad, int dni) {
        super(nombre, apellido, edad, dni);
        this.numCliente = numCliente;
        this.barcos = barcos;
        this.saldo = saldo;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public ArrayList<Barco> getBarcos() {
        return barcos;
    }

    public void setBarcos(ArrayList<Barco> barcos) {
        this.barcos = barcos;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numCliente=" + numCliente + ", barcos=" + barcos + ", saldo=" + saldo + '}';
    }
    
    
    
}
