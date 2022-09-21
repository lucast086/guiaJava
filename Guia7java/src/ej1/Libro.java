package ej1;

public class Libro {
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NumPages;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numPages) {
        this.ISBN = ISBN;
        Titulo = titulo;
        Autor = autor;
        NumPages = numPages;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getNumPages() {
        return NumPages;
    }

    public void setNumPages(int numPages) {
        NumPages = numPages;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN=" + ISBN +
                ", Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", NumPages=" + NumPages +
                '}';
    }
}
