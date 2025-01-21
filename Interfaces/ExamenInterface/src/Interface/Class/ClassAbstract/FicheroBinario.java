package Interface.Class.ClassAbstract;

import java.time.LocalDate;

public abstract class FicheroBinario extends Fichero {
    protected String[] bytes;

    public FicheroBinario(String nombre, double medidaTam, LocalDate fechaCreacion) {
        super(nombre, medidaTam, fechaCreacion);
    }

    public FicheroBinario(String nombre, double medidaTam, LocalDate fechaCreacion, String[] bytes) {
        super(nombre, medidaTam, fechaCreacion);
        this.bytes = bytes;
    }

    @Override
    public void mostrarInfoTam() {

    }

    @Override
    public void mostrarInfo() {

    }

    @Override
    public void imprimir() {

    }

    @Override
    public void reproducir() {

    }

    @Override
    public void analizarFichero() {

    }
}