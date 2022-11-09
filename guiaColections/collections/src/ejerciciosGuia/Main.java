package ejerciciosGuia;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numerosA = new ArrayList<Integer>();
        numerosA.add(36);
        numerosA.add(21);
        numerosA.remove(0);

        LinkedList<String> pokemones = new LinkedList<>();


        HashSet<Integer> numerosB = new HashSet<Integer>();
        numerosB.add(22);
        numerosB.add(15);
        numerosB.remove(22);

        HashMap<Integer, String> estudiantes = new HashMap<>();
        int dniE = 33444555;
        String nameE = "sasa";
        estudiantes.put(dniE, nameE);
        estudiantes.remove(dniE);


        //formas e recorrer FOREACH NO SIRVE PARA ELIMINAR ELEMENTOS, PORQUE TIENE EN CUENTA LA CANTIDAD DE ELEMENTOS AL PRINCIPIO DEL CICLO
        //Y SI YO ELIMINO UNO DE ESOS ELEMENTOS ENTONCES EL TAMANO VA A CAMBIAR Y VA A TENER POINTER NULL EXCEP

        for (Integer i : numerosA) {
            System.out.println(i.toString());
        }

        for (Integer i : numerosB) {
            System.out.println(i.toString());
        }

        for (Map.Entry<Integer, String> entrada : estudiantes.entrySet()) {
            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());
        }

        //otra orma de recorrer es con el objeto iterator.
        //toda coleccion tiene un metodo iterator que devuelve el iterador de esa coleccion. y a este lo guardamos en un OBJETO iterator
        //con ese objeto luego recorremos la coleccion
        Iterator<Integer> it = numerosB.iterator(); //tambien con HashSet y LinkedList


        //ahora pregunto si mi iterator tiene mas elementos para trabajar.
        while (it.hasNext()) {
            //   System.out.println(it.next()); //me devuelve el objeto
            //para remover yo tengo que manejar excepciones o ponerlo dentro de un if, para evitar intentar vorrar un objeto que no exista
            if (it.next() == 3) {
                it.remove();
            }

        }
        ArrayList<Libro> libreria = new ArrayList<>();
        libreria.add(new Libro("club de las 5 am", 240));

        for (Libro l : libreria) {
            System.out.println(l.toString());
        }

        ArrayList<Libro> coleccion = new ArrayList<>();
        coleccion.sort(Libro.comparador);
        // en la guia debo pasar un set a una lista para ordenarla, pero se puede usar el TreeSet y lista, ya te queda el set ordenado.
        // en el constructor puedo pasar un comparator, por lo que si quiero pasar de un HashSet a un TreeSet, voy a tener que usar un bucle para
        // recorrer el set y pasarle al TreeSet los elementos, un TreeSet que haya sido creado con un comparador
        TreeSet<Libro> col = new TreeSet<>(Libro.comparador);
        col.add(new Libro("habitos atomicos", 150));
        col.add(new Libro("habitos cosmicos", 150));
        col.add(new Libro("habitos moleculares", 150));
        // lo mismo para un HashMap y un TreeMap
    }
}
    class Libro {
        String titulo;
        Integer nPaginas;

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public Integer getnPaginas() {
            return nPaginas;
        }

        public void setnPaginas(Integer nPaginas) {
            this.nPaginas = nPaginas;
        }

        public Libro() {

        }
        public Libro(String titulo, Integer nPaginas) {
            this.titulo = titulo;
            this.nPaginas = nPaginas;
        }
        @Override
        public String toString() {
            return "Libro{ titulo "+titulo+" paginas: "+nPaginas+" }";
        }

        /* una forma de poder comparar estos objetos sin implementar una interfaz es generar un OBJETO comparator.
        este objeto implementa el metodo compare.
         */
        public static Comparator<Libro> comparador = new Comparator<Libro>() {

            @Override
            public int compare(Libro o1, Libro o2) {
                return o1.getTitulo().compareTo(o2.getTitulo());
            }

            @Override
            public Comparator<Libro> reversed() {
                return Comparator.super.reversed();
            }

            @Override
            public Comparator<Libro> thenComparing(Comparator<? super Libro> other) {
                return Comparator.super.thenComparing(other);
            }

            @Override
            public <U> Comparator<Libro> thenComparing(Function<? super Libro, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
                return Comparator.super.thenComparing(keyExtractor, keyComparator);
            }

            @Override
            public <U extends Comparable<? super U>> Comparator<Libro> thenComparing(Function<? super Libro, ? extends U> keyExtractor) {
                return Comparator.super.thenComparing(keyExtractor);
            }

            @Override
            public Comparator<Libro> thenComparingInt(ToIntFunction<? super Libro> keyExtractor) {
                return Comparator.super.thenComparingInt(keyExtractor);
            }

            @Override
            public Comparator<Libro> thenComparingLong(ToLongFunction<? super Libro> keyExtractor) {
                return Comparator.super.thenComparingLong(keyExtractor);
            }

            @Override
            public Comparator<Libro> thenComparingDouble(ToDoubleFunction<? super Libro> keyExtractor) {
                return Comparator.super.thenComparingDouble(keyExtractor);
            }
        };
        /* si implementos la interfaz comparable, hago al objeto capaz de ser comparado con otro objeto y
         entonces puede ser ordenado en listas o usado en treeset treemap como key, ya que puede ser ordenado

        @Override
        public int compareTo(Object o) {
            return 0;
        }
*/

        /* si yo implemento en esta clase la interfaz comparator tengo que escribir sus metodos
        @Override
        public int compare(Libro o1) {
            return this.titulo.compareTo(o1.getTitulo());
        }

        @Override
        public Comparator reversed() {
            return Comparator.super.reversed();
        }

        @Override
        public Comparator thenComparing(Comparator other) {
            return Comparator.super.thenComparing(other);
        }

        @Override
        public Comparator thenComparingInt(ToIntFunction keyExtractor) {
            return Comparator.super.thenComparingInt(keyExtractor);
        }

        @Override
        public Comparator thenComparingLong(ToLongFunction keyExtractor) {
            return Comparator.super.thenComparingLong(keyExtractor);
        }

        @Override
        public Comparator thenComparingDouble(ToDoubleFunction keyExtractor) {
            return Comparator.super.thenComparingDouble(keyExtractor);
        }

        @Override
        public Comparator thenComparing(Function keyExtractor) {
            return Comparator.super.thenComparing(keyExtractor);
        }

        @Override
        public Comparator thenComparing(Function keyExtractor, Comparator keyComparator) {
            return Comparator.super.thenComparing(keyExtractor, keyComparator);
        }

         */
    }
