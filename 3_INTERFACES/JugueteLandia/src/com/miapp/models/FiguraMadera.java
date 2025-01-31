package com.miapp.models;

import com.miapp.modelsAbstract.JugueteMadera;

import java.time.LocalDate;

public class FiguraMadera extends JugueteMadera {
    private String color;
    private int numLados;

    //Creando constructor Pre-Definido
    public FiguraMadera(String nombre, String marca, LocalDate fechaTala, String origen) {
        super(nombre, marca, fechaTala, origen);
    }

    public String getColor() {
        return color;
    }

    public int getNumLados() {
        return numLados;
    }

    @Override
    public String toString() {
        return "FiguraMadera{" +
                "color='" + color + '\'' +
                ", numLados=" + numLados +
                '}';
    }
}
