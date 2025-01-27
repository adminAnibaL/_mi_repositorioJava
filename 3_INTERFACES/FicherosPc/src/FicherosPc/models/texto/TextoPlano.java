package FicherosPc.models.texto;

import FicherosPc.models.Fichero;

import java.time.LocalDate;

public class TextoPlano extends Fichero {
    public TextoPlano(String nombre, long tamaño, LocalDate fechaCreacion) {
        super(nombre, tamaño, fechaCreacion);
    }
}
