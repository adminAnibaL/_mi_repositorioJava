package Interface.Class.SubClassBinario;

import Interface.Class.ClassAbstract.FicheroBinario;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FicheroVideo extends FicheroBinario {
    private LocalDateTime duracionSegundos;
    // private String [] contenidoArray;
    public FicheroVideo(String nombre, double medidaTam, LocalDate fechaCreacion) {
        super(nombre, medidaTam, fechaCreacion);
    }

    public FicheroVideo(String nombre, double medidaTam, LocalDate fechaCreacion, String[] bytes) {
        super(nombre, medidaTam, fechaCreacion, bytes);
    }
}
