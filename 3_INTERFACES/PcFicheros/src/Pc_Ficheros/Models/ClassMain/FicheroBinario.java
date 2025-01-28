package Pc_Ficheros.Models.ClassMain;

import Pc_Ficheros.Interface.Reproducir;

import java.time.LocalDate;

public abstract class FicheroBinario extends Fichero {

    private byte[] contenido;
    public FicheroBinario(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
        this.contenido = contenido;
    }
}
