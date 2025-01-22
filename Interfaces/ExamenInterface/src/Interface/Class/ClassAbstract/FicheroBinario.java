package Interface.Class.ClassAbstract;

import java.time.LocalDate;

public abstract class FicheroBinario extends Fichero {
    protected String[] bytes;

    public FicheroBinario(String nombre, double medidaTam, LocalDate fechaCreacion) {
        super(nombre, medidaTam, fechaCreacion);
    }



    @Override
    public void mostrarInfoTam() {

    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tamaño: " + medidaTam + " bytes");
        System.out.println("Fecha de creación: " + fechaCreacion);

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