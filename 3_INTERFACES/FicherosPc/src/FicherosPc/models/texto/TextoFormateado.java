package FicherosPc.models.texto;

import FicherosPc.models.Fichero;

import java.time.LocalDate;

public class TextoFormateado extends Fichero {
    private String tipoFuente;
    private int tamañoFuente;
    private String colorFuente;

    public TextoFormateado(String nombre, long tamaño, LocalDate fechaCreacion) {
        super(nombre, tamaño, fechaCreacion);
    }
}
