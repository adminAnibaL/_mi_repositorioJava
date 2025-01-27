package FicherosPc.models.binarios;

import FicherosPc.models.Fichero;

import java.time.LocalDate;

public class Ejecutable extends Fichero {

    private byte[] contenido;
    private int permisos;
    public Ejecutable(String nombre, long tamaño, LocalDate fechaCreacion) {
        super(nombre, tamaño, fechaCreacion);
    }
}
