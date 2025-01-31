package com.miApp.models;

import com.miApp.abstractmodels.JugueteMadera;
import com.miApp.interfaces.Apilable;

import java.time.LocalDate;

public class InstrumentoMusical extends JugueteMadera implements Apilable {
    private int edadInstrumento;

    public InstrumentoMusical(String nombre, String marca) {
        super(nombre, marca);
    }

    public InstrumentoMusical(String nombre, String marca, String origen, LocalDate fechaTala) {
        super(nombre, marca, origen, fechaTala);
    }


    public int getEdadInstrumento() {
        return edadInstrumento;
    }

    @Override
    public void apilar() {

    }
}
