package Interface.Class.SubClassBinario;

import Interface.Class.ClassAbstract.FicheroBinario;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FicheroAudio extends FicheroBinario {
    private LocalDateTime duracionSegundos;
    // private String [] contenidoArray;

    public FicheroAudio(String nombre, double medidaTam, LocalDate fechaCreacion) {
        super(nombre, medidaTam, fechaCreacion);
    }

    public FicheroAudio(String nombre, double medidaTam, LocalDate fechaCreacion, String[] bytes) {
        super(nombre, medidaTam, fechaCreacion, bytes);
    }


// creando los getters


    public LocalDateTime getDuracionSegundos() {
        return duracionSegundos;
    }
}
