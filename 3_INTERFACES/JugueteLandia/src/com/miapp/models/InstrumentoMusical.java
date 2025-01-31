package com.miapp.models;

import com.miapp.modelsAbstract.JugueteMadera;

import java.time.LocalDate;

public class InstrumentoMusical  extends JugueteMadera {
    private int edadMinima;

    public InstrumentoMusical(String nombre, String marca, LocalDate fechaTala, String origen) {
        super(nombre, marca, fechaTala, origen);
        this.edadMinima = edadMinima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    @Override
    public String toString() {
        return "InstrumentoMusical{" +
                "edadMinima=" + edadMinima +
                '}';
    }
}
