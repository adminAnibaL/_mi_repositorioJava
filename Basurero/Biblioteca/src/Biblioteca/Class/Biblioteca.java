package Biblioteca.Class;

import java.util.Arrays;

public class Biblioteca {
    private static final int CAPACIDAD_MAX_LIBROS = 5;

    private String ubicacion;
    private Libro[] cajaLibros;

    public Biblioteca(String ubicacion) {
        this.ubicacion = ubicacion;
        this.cajaLibros = new Libro[CAPACIDAD_MAX_LIBROS];

    }


    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Libro[] getCajaLibros() {
        return cajaLibros;
    }

    public void setCajaLibros(Libro[] cajaLibros) {
        this.cajaLibros = cajaLibros;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "Ubicacion='" + ubicacion + '\'' +
                ", cajaLibros=" + Arrays.toString(cajaLibros) +
                '}';
    }
}
