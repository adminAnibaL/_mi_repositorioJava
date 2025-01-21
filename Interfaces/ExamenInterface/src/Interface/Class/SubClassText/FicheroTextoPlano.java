package Interface.Class.SubClassText;

import Interface.Class.ClassAbstract.FicheroTexto;

import java.time.LocalDate;

public class FicheroTextoPlano extends FicheroTexto {

    public FicheroTextoPlano(String nombre, double tamaño, LocalDate fechaCreacion) {
        super(nombre, tamaño, fechaCreacion);
    }
}
