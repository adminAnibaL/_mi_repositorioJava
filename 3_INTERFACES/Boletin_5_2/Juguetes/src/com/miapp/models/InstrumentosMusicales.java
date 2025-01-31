package com.miapp.models;

import com.miapp.abstractmodels.Juguete;
import com.miapp.abstractmodels.JugueteMadera;
import com.miapp.interfaces.Apilable;

import java.time.LocalDate;

public class InstrumentosMusicales extends JugueteMadera implements Apilable {
    private int edadMinimaInstrumento;

    public InstrumentosMusicales(String nombre, String marca, String descripcion, String origen, LocalDate fechaTala, int edadMinimaInstrumento) {
        super(nombre, marca, descripcion, origen, fechaTala);
        this.edadMinimaInstrumento = edadMinimaInstrumento;
    }

    @Override
    public void apliar(Juguete juguete) {

    }
}
