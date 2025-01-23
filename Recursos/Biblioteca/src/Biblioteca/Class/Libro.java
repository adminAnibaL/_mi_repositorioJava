package Biblioteca.Class;

public class Libro {
    private String titulo;
    private String ISBN;


    public Libro(String titulo, String ISBN) {
        this.titulo = titulo;
        this.ISBN = ISBN;
    }

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getISBN() {
        return ISBN;
    }
}
