package com.miapp.models;

import com.miapp.abstractmodels.JugueteMadera;

import java.time.LocalDate;

public class InstrumentosMusicales extends JugueteMadera {
    private int edadMinimaInstrumento;

    public InstrumentosMusicales(String nombre, String marca, String descripcion, String origen, LocalDate fechaTala, int edadMinimaInstrumento) {
        super(nombre, marca, descripcion, origen, fechaTala);
        this.edadMinimaInstrumento = edadMinimaInstrumento;
    }
}
