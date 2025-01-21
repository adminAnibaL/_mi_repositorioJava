package Boletin_4_1.Biblioteca.Class;

public class Libro {
    private String titulo;
    private boolean prestado;


    public Libro(String titulo) {
        this.titulo = titulo;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}
