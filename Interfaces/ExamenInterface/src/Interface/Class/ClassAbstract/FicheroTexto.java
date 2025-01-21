package Interface.Class.ClassAbstract;

import java.time.LocalDate;

public abstract class FicheroTexto extends Fichero {
    protected String tipoFuente;
    protected int tamFuente;
    protected String colorFuente;

    public FicheroTexto(String nombre, double medidaTam, LocalDate fechaCreacion) {
        super(nombre, medidaTam, fechaCreacion);
    }

    public FicheroTexto(String nombre, double medidaTam, LocalDate fechaCreacion, String tipoFuente, int tamFuente, String colorFuente) {
        super(nombre, medidaTam, fechaCreacion);
        this.tipoFuente = tipoFuente;
        this.tamFuente = tamFuente;
        this.colorFuente = colorFuente;
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
