package ej5;

import ej5.CuentaService;
import ej5.entidades.Cuenta;

public class Main {
    public static void main (String[]args){
        //aca podria manejar un menu de opciones
        CuentaService ccS = new CuentaService();

        Cuenta acc1 = ccS.crearCuenta();
        Cuenta acc2 = ccS.crearCuenta();
        Cuenta acc3 = ccS.crearCuenta();

        ccS.consultarDatos(acc3);

        ccS.consultarDatos(acc1);
        ccS.ingresar(acc1);
        ccS.extraccionRapida(acc1);
        ccS.consultarSaldo(acc1);
        ccS.retirar(acc1);
    }
}
