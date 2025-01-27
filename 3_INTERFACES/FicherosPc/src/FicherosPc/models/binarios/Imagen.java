package FicherosPc.models.binarios;

import FicherosPc.models.Fichero;

import java.time.LocalDate;

public class Imagen extends Fichero {
    private byte[] contenido;
    private String formato;

    public Imagen(String nombre, long tamaño, LocalDate fechaCreacion) {
        super(nombre, tamaño, fechaCreacion);
    }
}
