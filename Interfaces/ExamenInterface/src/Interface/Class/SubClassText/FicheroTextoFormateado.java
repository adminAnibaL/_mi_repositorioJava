package Interface.Class.SubClassText;

import Interface.Class.ClassAbstract.FicheroTexto;

import java.time.LocalDate;

public class FicheroTextoFormateado extends FicheroTexto {


    public FicheroTextoFormateado(String nombre, double tamaño, LocalDate fechaCreacion) {
        super(nombre, tamaño, fechaCreacion);
    }

    public FicheroTextoFormateado(String nombre, double tamaño, LocalDate fechaCreacion, String tipoFuente, int tamañoFuente, String colorFuente) {
        super(nombre, tamaño, fechaCreacion, tipoFuente, tamañoFuente, colorFuente);
    }



}
