package com.miApp.models;

import com.miApp.abstractmodels.JuguetePlastico;
import com.miApp.interfaces.Apilable;

public class PiezaLego extends JuguetePlastico implements Apilable {
    private double longitud;
    private String colorLego;

    public PiezaLego(String nombre, String marca) {
        super(nombre, marca);
    }

    @Override
    public void apilar() {

    }
}
