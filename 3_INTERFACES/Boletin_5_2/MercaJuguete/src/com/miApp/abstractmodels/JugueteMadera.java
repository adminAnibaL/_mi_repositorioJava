package com.miApp.abstractmodels;

import java.time.LocalDate;

public abstract class JugueteMadera extends Juguete {
    private String origen;
    private LocalDate fechaTala;


    public JugueteMadera(String nombre, String marca) {
        super(nombre, marca);
    }

    public JugueteMadera(String nombre, String marca, String origen, LocalDate fechaTala) {
        super(nombre, marca);
        this.origen = origen;
        this.fechaTala = fechaTala;
    }
}
