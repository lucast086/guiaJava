package ejExtra6;

import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoService {
    Ahorcado game;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    boolean config;

    public AhorcadoService() {
    }
    public void iniciarJuego(){
        game = new Ahorcado();
        config = false;
        boolean exit = false;
        do {
            int opt;

            do {
                limpiarConsola();
                System.out.println("  ********************");
                System.out.println("  *     AHORCADO     *");
                System.out.println("  ********************");
                System.out.println("  *                  *");
                System.out.println("  *       MENU       *");
                System.out.println("  * 1- INICIAR JUEGO *");
                System.out.println("  * 2- CONFIGURACION *");
                System.out.println("  * 3- INSTRUCCIONES *");
                System.out.println("  * 4- SALIR         *");
                opt = leer.nextInt();
            }while (!isOption(opt));
            switch (opt){
                case 1: juego(game);
                    break;
                case 2: configurar(game);
                    break;
                case 3: instrucciones();
                    break;
                case 4: exit = true;
                    break;
            }
        }while(!exit);
    }

    /*
    este metodo explica como se juega el ahorcado
     */
    private void instrucciones() {
        System.out.println("MENU CONFIGURACION");
        System.out.println(" en este menu podra elegir la dificultad, las palabras faciles son de 4 o 5 letras y la cantidad" +
                            "de intentos es el triple del tamaño de la palabra ");
        System.out.println(" en la seccion personalizada puede elegir la palabra secreta y la cantidad de oportunidades para adivinar.");
        System.out.println("si no configura su juego antes de iniciar, este se pondra por defecto en normal.");
        System.out.println("gracias ");
        System.out.println("presione enter para volver al menu anterior");
        String a = leer.next();
    }

    private boolean isOption(int opt) {
        return (opt == 1 || opt == 2 || opt == 3 || opt == 4);
    }

    /*
    primero verifica que se haya realizado una configuracion, de NO ser asi, lo que hace es crear un juegoRapido (METODO)
    una vez obtenido el juego se muestra un menu para que el usuario vaya adivinando las letras.
    tambien se llama a un metodo que va a ir dibujando el ahorcado segun las posibilidades agotadas.
     */
    private void juego(Ahorcado game) {

        if (!config) juegoRapido(game);
        String[] pal = new String[game.longitud()];
        Arrays.fill(pal,"_");
        do {
            limpiarConsola();
           // control(game);
            System.out.println("PALABRA A ADIVINAR");
            System.out.println("Longitud: " + game.longitud());
            System.out.println("Letras encontradas: " + game.getEncontradas());
            System.out.println("Intentos Restantes: " + intentos(game));
            System.out.println(" ");

            for (int i = 0 ; i < pal.length ; i++){
                System.out.print(" "+pal[i]+" ");
            }

            System.out.println(" ");
            dibujar(game);
            System.out.println(" ");
            System.out.println("INGRESE UNA LETRA");
            String letra = leer.next().toUpperCase();
            int find = buscar(game, letra);

            if (find >= 0) {
                System.out.println("LETRA ENCONTRADA");
                game.setEncontradas(game.getEncontradas()+1);
                pal[find] = game.getPalabra()[find];
            } else {
                System.out.println("LETRA NO ENCONTRADA");
            }
            game.setTurnos(game.getTurnos()+1);
        }while(intentos(game) > 0 && !winCondition(game));

        if (winCondition(game)) {
            System.out.println("FELICIDADES HAS GANADO EL JUEGO");
            System.out.print("PALABRA OCULTA: ");
            for (int i = 0 ; i < pal.length ; i++){
                System.out.print(" "+pal[i]+" ");
            }
            System.out.println(" ");
        }
        else System.out.println("HAS PERDIDIO, INTENTALO DE NUEVO EN UNA DIFICULTAD MENOR");
        System.out.println("ENTER PARA SALIR");
        String x = leer.next();
    }


    //CUANDO LA CANTIDAD DE ENCONTRADAS ES IGUAL A LA LONGITUD DE LA PALABRA SE DA LA CONDICION DE VICTORIA
    private boolean winCondition(Ahorcado game ){
        return  game.getEncontradas() == game.longitud();
    }
    private int buscar(Ahorcado game, String letra) {
       for (int i = 0 ; i < game.longitud() ; i++){
           String l = game.getPalabra()[i];
           if (letra.equals(l)) {
               String[] ar = game.getPalabra();
               ar[i] = game.getPalabra()[i].toLowerCase();
               game.setPalabra(ar);
               return i;
           }
       }
       return -1;
    }


    //retorna cuantos intentos quedan.
    private int intentos(Ahorcado game){
        return game.getJugadasMaximas()- game.getTurnos();
    }


    //solo para test.
public void control(Ahorcado game){
    System.out.print("** CONTROL:  ");
       System.out.println(" ");
    System.out.println(game.toString());
}



    //cuando no se hizo configuracion se setea un juego con valores normales
    private void juegoRapido(Ahorcado game){
        game.setJugadasMaximas(12);
        game.setPalabra(palabras(2));
    }
    /*
    este metodo va a dibujar el muñeco a medida que avance el juego.
    el juego va a dibujar de 3 maneras, segun la longitud de la palabra.
    por cada intento restante menos los acertados, va a dar un numero.
    ese numero va a indicar el progreso del dibujo.
     */
    private void dibujar(Ahorcado game){
        int dibujoActual = intentos(game);
        double porcentaje = (dibujoActual*100) / game.getJugadasMaximas(); // represeta el porcentaje total del dibujo segun la cantidad de jugadas maximas que tiene.

        if (porcentaje > 90){
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||               ");
            System.out.println("     ||           ");
            System.out.println("    (())            ");
            System.out.println("   ((()))           ");
            System.out.println("__(((())))____________");
        } else if (porcentaje > 80) {
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||        ");
            System.out.println("    (())            ");
            System.out.println("   ((()))           ");
            System.out.println("__(((())))____________");
        } else if (porcentaje > 70) {
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||         |      ");
            System.out.println("    (())            ");
            System.out.println("   ((()))           ");
            System.out.println("__(((())))____________");
        } else if (porcentaje > 60){
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||        /|     ");
            System.out.println("    (())            ");
            System.out.println("   ((()))           ");
            System.out.println("__(((())))____________");

        } else if (porcentaje > 50) {
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||       _/|     ");
            System.out.println("    (())            ");
            System.out.println("   ((()))           ");
            System.out.println("__(((())))____________");
        } else if (porcentaje > 40) {
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||       _/|"+Character.toString(92)+"      ");
            System.out.println("    (())            ");
            System.out.println("   ((()))           ");
            System.out.println("__(((())))____________");

        } else if (porcentaje > 30) {
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||       _/|"+Character.toString(92)+"_      ");
            System.out.println("    (())            ");
            System.out.println("   ((()))           ");
            System.out.println("__(((())))____________");
        } else if (porcentaje > 20) {
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||       _/|"+Character.toString(92)+"_      ");
            System.out.println("    (())        |    ");
            System.out.println("   ((()))           ");
            System.out.println("__(((())))____________");
        } else if (porcentaje > 10) {
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||       _/|"+Character.toString(92)+"_      ");
            System.out.println("    (())        |   ");
            System.out.println("   ((()))      /    ");
            System.out.println("__(((())))____________");
        } else {
            System.out.println("     ===========|   ");
            System.out.println("     ||         |     ");
            System.out.println("     ||        (@)      ");
            System.out.println("     ||       _/|"+Character.toString(92)+"_      ");
            System.out.println("    (())        |   ");
            System.out.println("    ((()))     / "+Character.toString(92)+"      ");
            System.out.println("__(((())))____________");
        }

        // los intentos que le quedan, representa el porcentaje de dibujo del ahorcado.
        // con un swich voy a representar los posibles porcentajes de dibujo. 10 20 ... 90 ...
        //en cada caso el dibujo va a ser mas amplio.
    }




    /*
    el usuario puede elegir entre facil medio  dificil personalizado y varia la longitud de la palabra y la cantidad oportunidades
    y crea un nuevo juego con esas configuraciones.
    en personalizado el usuario elige la cantidad maxima de posibilidades y la palabra.
    ademas setea el flag config para saque que el usuario eligio por medio de un menu.
    */
    private void configurar(Ahorcado game) {
            int opt;

            do {
                limpiarConsola();
                System.out.println("      *************");
                System.out.println("      *  AHORCADO *");
                System.out.println("      *************");
                System.out.println(" ");
                System.out.println("  *   CONFIGURACION   *");
                System.out.println("  * 1- FACIL          *");
                System.out.println("  * 2- NORMAL         *");
                System.out.println("  * 3- DIFICIL        *");
                System.out.println("  * 4- PERSONALIZADO  *");
                opt = leer.nextInt();
            }while (!isOption(opt));
            switch (opt){
                case 1: game.setPalabra(palabras(1));
                    game.setJugadasMaximas(16);
                    break;
                case 2: game.setPalabra(palabras(2));
                    game.setJugadasMaximas(12);
                    break;
                case 3: game.setPalabra(palabras(3));
                    game.setJugadasMaximas(10);
                    break;
                case 4:
                    System.out.println("CONFIGURACION PERSONALIZADA. PRES ENTER PARA CONTINUAR");
                    String palabra = leer.nextLine();
                    System.out.println("Ingrese la palabra a adivinar");
                    palabra = leer.nextLine();
                    System.out.println(palabra+" es la palabra elegida");
                    String[] word = palabra.split("");
                    game.setPalabra(word);
                    System.out.println("Ingrese la cantidad maxima de jugadas");
                    int x = leer.nextInt();
                    game.setJugadasMaximas(x);
                    break;
            }
            game.setTurnos(0);
            game.setEncontradas(0);
            System.out.println("CAMBIOS REALIZADOS - PRESIONE ENTER PARA VOLVER AL MENU");
            String a = leer.next();
            config = true;
    }


    //FALTA AMPLIAR LA CANTIDAD DE PALABRAS RESERVADAS A ADIVINAR
    //pero basicamente segun la dificultad seleccionada por el usuario. Retorna un arreglo con la palabra seleccionada al azar, (cada elemento del arrego es una letra de la palabra
    private String[] palabras(int i) {
        String[] faciles = {"META","LIST","LONG","JAVA","POO","COLA","PILA","CLASE","EGG","SQL"};
        String[] normales = {"LUCAST","ARRAY","DOUBLE","INTEGER","STRING","SPRING","JSON","MAVEN","CRUD","GITHUB"};
        String[] dificiles = {"VARIABLE","ARRAYLIST","STATIC","EXTENDS","IMPLEMENTS","ENCAPSULAMIENTO","HERENCIA","POLIMORISMO","INTELLIJ","NETBEANS"};
        String chosen ="";
        int position = Math.toIntExact(Math.round(Math.random()*10));
        switch (i)  {
            case 1: chosen = faciles[position];
                break;
            case 2: chosen = normales[position];
                break;
            case 3: chosen = dificiles[position];
                break;
        }
        return chosen.split("");

    }
    private void limpiarConsola(){
        for (int i = 0 ; i < 50 ; i++){
            System.out.println(" ");
        }
    }
}
