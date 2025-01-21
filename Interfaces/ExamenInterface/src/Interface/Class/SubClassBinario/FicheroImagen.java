package Interface.Class.SubClassBinario;

import Interface.Class.ClassAbstract.FicheroBinario;

import java.time.LocalDate;

public class FicheroImagen extends FicheroBinario {
    private String formato;
    // private String [] contenidoArray;
    public FicheroImagen(String nombre, double medidaTam, LocalDate fechaCreacion) {
        super(nombre, medidaTam, fechaCreacion);
    }

    public FicheroImagen(String nombre, double medidaTam, LocalDate fechaCreacion, String[] bytes) {
        super(nombre, medidaTam, fechaCreacion, bytes);
    }
}
