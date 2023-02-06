/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Alquiler;
import Entidades.Amarre;
import Entidades.Barco;
import Entidades.BarcoAmotor;
import Entidades.Cliente;
import Entidades.Persona;
import Entidades.Puerto;
import Entidades.Velero;
import Entidades.YateDeLujo;
import Enums.TipoDeBarco;
import static Enums.TipoDeBarco.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import static java.util.concurrent.TimeUnit.DAYS;

/**
 *
 * @author lucas
 */
public class Servicios {
    Scanner leer = new Scanner(System.in);
    ArrayList<Alquiler> alquileres = new ArrayList<>();
    
    
    /*
    * crear puerto ---
    crear alquiler
    crear cliente -----
    crear amarres ----
    crear persona---
    crear barcos----
    
private calcular alquiler
private calcular modulo
    mostrar amarres disponibles
alquilar
    */
    
    //ESTOS METODOS TIENEN EL FIN DE CREAR UN PUERTO CON SU BASE DE CLIENTES
    //PARA PODER EJECUTAR LA PRUEBA DEL PROGRAMA.
    
    // se que son muchos metodos pero intento marcar que deberia haber un servicio que trate cada una de las entidades.
    
    //creo un puerto con amarres disponibles.
    public Puerto crearPuerto(){
        Puerto puerto = new Puerto(crearAmarres());
        return puerto;
    }
    
    // creo una cantidad de amarres con barcos a disponer.
    private ArrayList<Amarre> crearAmarres(){
        
        ArrayList<Amarre> amarres = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Amarre amarre;
            if (i < 4) {
                amarre = new Amarre(i, true, VELERO);
                
            } else if (i < 7){
                 amarre = new Amarre(i, true, BARCOAMOTOR);
                
            } else amarre = new Amarre(i, true, BARCOAMOTOR);
            
            amarres.add(amarre);
        }
        return amarres;
    }
    
    
    
    //creo una lista de potenciales clientes para el puerto
    public ArrayList<Cliente> crearClientes(){
        ArrayList<Cliente> clientes = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            //creo una persona que va a ser un cliente potencial
            Persona persona = new Persona("cliente", (" "+i), i, i);
            //creo un cliente con los datos de la persona
            Cliente cliente = new Cliente(i, crearBarcos(i), (200+i*100), persona.getNombre(),
                                            persona.getApellido(),persona.getEdad(),persona.getDni());

            //agrego el cliente a la lista
            clientes.add(cliente);
        }
        return clientes;
    }
    
    
    //creo una lista de los barcos que tiene el cliente, para probar solo se crea 1 barco por cliente.
    private ArrayList<Barco> crearBarcos(int i){
    ArrayList<Barco> barcos = new ArrayList<>();
            Barco barco;
            if (i < 4) {
                barco = crearVelero(i);
            } else if (i< 9){
                 barco = crearBarcoMotor(i);
            } else barco = crearYate(i);
            
            barcos.add(barco);

        return barcos;
        
    }
    
    
   
    private Velero crearVelero(int i) {

        Date añoFabricacion = new Date((2000+i), i, i);
        return new Velero(i, i,(i+10),añoFabricacion);
    }

    private YateDeLujo crearYate(int i ) {
        Date añoFabricacion = new Date((2000+i), i, i);
        return new YateDeLujo(i,(i+50), i,(i+10),añoFabricacion);    
    }

    private BarcoAmotor crearBarcoMotor(int i) {
        Date añoFabricacion = new Date((2000+i), i, i);
        return new BarcoAmotor((i+30), i,(i+10),añoFabricacion);
    }
    
    //en una lista puedo guardar los alquileres que hay vigentes.
    public Alquiler crearAlquiler(Puerto puerto, Cliente cliente){
        int diasAlquiler = (int) (Math.random() * 10) + 2;
        System.out.println("crearAlquiler");
        Date fechaActual = new Date();
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaActual); // Configuramos la fecha que se recibe
        calendar.add(Calendar.DAY_OF_YEAR, diasAlquiler);  // numero de días a añadir, o restar en caso de días<0
      
        Date fechaDevol = calendar.getTime();
        
        Barco barco = cliente.getBarcos().get(0);
        Amarre amarre = buscarAmarre(puerto, barco);
        
        Alquiler alq = new Alquiler(cliente, fechaActual, fechaDevol, amarre, 0f);
        alquileres.add(alq);
        return alq;
    }

    private Amarre buscarAmarre(Puerto puerto, Barco barco) {
        Amarre am = null;
        System.out.println("buscar amarre");
        for (Amarre a : puerto.getAmarres()){
            if ( (0 == a.getTipoDebarco().compareTo(barco.getTipoDeBarco())) && a.isDisponible()){
                am = a;
                a.setDisponible(false);
                break;
            }
        }
        return am;
    }
    
    public float calcularAlquiler(Alquiler alquiler){
        System.out.println("estoy en calcular alquiler");
        
        Date fechaI = alquiler.getFechaAlquiler();
        Date fechaF = alquiler.getFechaDevolucion();
        
        long milisInDay = 86400000;
        int dias = (int) ((fechaF.getTime() - fechaI.getTime()) / milisInDay);
        System.out.println("dias "+dias);
        float modulo = calcularModulo(alquiler.getCliente().getBarcos().get(0)); 
        
        
        return dias * modulo;
    }

    private float calcularModulo(Barco barco) {
        float modulo = 10 * barco.getEslora();
        
        System.out.println("estoy en calcular modulo");
               
        if (barco instanceof Velero velero) modulo+= velero.getNumMastiles();
        
        if (barco instanceof YateDeLujo yateDeLujo) modulo+= 
                                        yateDeLujo.getNumCamarotes() +
                                        yateDeLujo.getPotenciaCV();
        
        if (barco instanceof BarcoAmotor barcoAmotor) modulo+= barcoAmotor.getPotenciaCV();
                
        
        return modulo;
    }

    public boolean pagarAlquiler(Cliente cl){
        
        boolean pagado = false;
        float suma = 0;
        ArrayList<Alquiler> alquileresCliente = new ArrayList<>();
        
        for (int i = 0; i < alquileres.size(); i++) {
            
            Alquiler alquiler = alquileres.get(i);                       
            
            if (alquiler.getCliente().equals(cl) ){
                alquileresCliente.add(alquiler);
                float sumaParcial = calcularAlquiler(alquiler);
                System.out.println("suma parcial "+sumaParcial);
                suma += sumaParcial; 
            }
                        
        }
        System.out.println("Deuda "+ suma);
        System.out.println("Plata de cliente" +cl.getSaldo());
        if (suma <= cl.getSaldo()){

            cl.setSaldo(cl.getSaldo()-suma);
            alquileres.remove(alquileresCliente);
            pagado = true;
        }
        return pagado;
    }
    
}
