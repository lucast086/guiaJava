package ej5;

import ej5.entidades.Cuenta;
import java.util.Scanner;

public class CuentaService {
    Scanner l = new Scanner(System.in).useDelimiter("\n");
    Long nAcc = 0L;
    Double interes = 0.69D;

    public CuentaService() {
    }

    public Cuenta crearCuenta(){
        Scanner leer = new Scanner(System.in);
        System.out.println("** CREACION DE CUENTAS ** ");
        System.out.println("INGRESE LOS SIGUIENTES DATOS");
        System.out.println("Dni: ");
        Long dni = leer.nextLong();
              //Math.toIntExact(Math.round(Math.random() * 10000));
        nAcc++;
        System.out.println("CUENTA N° "+nAcc+" CREADA CON EXITO");
       return new Cuenta(nAcc,dni,0D,interes);
    }
    public void ingresar(Cuenta c){
        System.out.println("INGRESE LA CANTIDAD DE DINERO A DEPOSITAR");
        double dep = l.nextDouble();
        c.setSaldoActual(c.getSaldoActual()+dep);
    }
    public void retirar(Cuenta c){
        System.out.println("INGRESE LA CANTIDAD DE DINERO A RETIRAR ");
        double retiro = l.nextDouble();
        if (retiro <= c.getSaldoActual()) {
            c.setSaldoActual(c.getSaldoActual()-retiro);
            System.out.println("DINERO RETIRADO $ "+retiro);
        } else {
            System.out.println("SU SALDO ES INSUFICIENTE");
            System.out.println("DINERO RETIRADO $ "+c.getSaldoActual());
            c.setSaldoActual(0D);
        }
    }
    public void extraccionRapida(Cuenta c){
        System.out.println("INGRESE LA CANTIDAD DE DINERO A RETIRAR ");
        double retiro = l.nextDouble();
        double maxRapid = c.getSaldoActual() * 0.2;
        if (retiro <= maxRapid) {
            System.out.println("DINERO RETIRADO $ "+retiro);
            c.setSaldoActual(c.getSaldoActual()-retiro);
        } else {
            System.out.println("MONTO MAXIMO A RETIRAR POR EXTRACCION RAPIDA $ "+maxRapid);
            int ot;
            do {
                System.out.println("DESEA RETIRAR? 1: Si / 2: No ");
                ot = l.nextInt();
            } while (ot != 1 || ot !=2);
                if (ot == 1) {
                    System.out.println("DINERO RETIRADO $ " + maxRapid);
                    c.setSaldoActual(c.getSaldoActual() - maxRapid);
                }
                else System.out.println("OPERACION CANCELADA");
        }
    }
    public void consultarSaldo(Cuenta c){
        System.out.println("SU SALDO ACTUAL ES $ "+c.getSaldoActual());
    }
    public void consultarDatos(Cuenta c){
        System.out.println("DATOS DE LA CUENTA");
    }
}