package Boletin_4_1.Biblioteca.Class;

public class Biblioteca {
    private String lugar;
    private Libro[] listaLibros;


    public Biblioteca(String lugar) {
        this.lugar = lugar;
        this.listaLibros = new Libro[5];
    }


    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Libro[] getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(Libro[] listaLibros) {
        this.listaLibros = listaLibros;
    }
}
