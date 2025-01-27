package FicherosPc.models.binarios;

import FicherosPc.models.Fichero;

import java.time.LocalDate;

public class Video extends Fichero {
private byte [] contenido;
private long duracion;

    public Video(String nombre, long tamaño, LocalDate fechaCreacion) {
        super(nombre, tamaño, fechaCreacion);
    }
}
