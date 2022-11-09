package Ej3;

import java.util.ArrayList;
import java.util.Comparator;

public class Alumno {
    String name;
    ArrayList<Integer> notas = new ArrayList<>(3);


    public Alumno() {
    }

    public Alumno(String name, ArrayList<Integer> notas) {
        this.name = name;
        this.notas = notas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "name=' " + name + '\'' +
                ", notas= " + notas +
                '}';
    }

    public static Comparator<Alumno> comparador = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    }
