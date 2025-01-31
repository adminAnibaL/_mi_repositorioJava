package com.miApp.models;

import com.miApp.abstractmodels.JugueteMadera;
import com.miApp.interfaces.Apilable;

import java.time.LocalDate;

public class FiguraMadera extends JugueteMadera implements Apilable {
    private String colorFigura;
    private int numLados;

    public FiguraMadera(String origen, LocalDate fechaTala) {
        super(origen, String.valueOf(fechaTala));
    }

    public FiguraMadera(String nombre, String marca, String colorFigura) {
        super(nombre, marca);
        this.colorFigura = colorFigura;
    }

    public FiguraMadera(String nombre, String marca, String origen, LocalDate fechaTala, String colorFigura) {
        super(nombre, marca, origen, fechaTala);
        this.colorFigura = colorFigura;
    }

    public String getColorFigura() {
        return colorFigura;
    }

    public int getNumLados() {
        return numLados;
    }

    @Override
    public void apilar() {

    }
}
