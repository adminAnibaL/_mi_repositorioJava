package Interface.Class.SubClassBinario;

import Interface.Class.ClassAbstract.FicheroBinario;

import java.time.LocalDate;

public class FicheroEjecutable extends FicheroBinario {
    private int permisoNumericoLinux;
    // private String [] contenidoArray;

    public FicheroEjecutable(String nombre, double medidaTam, LocalDate fechaCreacion) {
        super(nombre, medidaTam, fechaCreacion);
    }


}
