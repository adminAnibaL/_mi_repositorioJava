package com.miapp.models;

import com.miapp.abstractmodels.Juguete;
import com.miapp.abstractmodels.JugueteMadera;
import com.miapp.interfaces.Apilable;

import java.io.Serializable;
import java.time.LocalDate;

public class FigurasMadera extends JugueteMadera implements Apilable {
    private String colorFigura;
    private int numLados;

    public FigurasMadera(String nombre, String marca, String descripcion, String origen, LocalDate fechaTala, String colorFigura, int numLados) {
        super(nombre, marca, descripcion, origen, fechaTala);
        this.colorFigura = colorFigura;
        this.numLados = numLados;
    }



    @Override
    public void apliar(Juguete juguete) {
        Apilable.super.apilar(juguete);

    }
}
