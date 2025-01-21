package Interface.Class.ClassAbstract;

import Interface.Interface.Contrato;

import java.time.LocalDate;

public abstract  class Fichero implements Contrato {


    protected String nombre;
    protected double medidaTam;
    protected LocalDate fechaCreacion;

    public Fichero(String nombre, double medidaTam, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.medidaTam = medidaTam;
        this.fechaCreacion = fechaCreacion;
    }
}
