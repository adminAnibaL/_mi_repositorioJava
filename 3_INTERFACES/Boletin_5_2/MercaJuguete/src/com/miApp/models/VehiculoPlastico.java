package com.miApp.models;

import com.miApp.abstractmodels.JuguetePlastico;
import com.miApp.interfaces.Apilable;

public class VehiculoPlastico extends JuguetePlastico implements Apilable {
    private int numRuedas;

    public VehiculoPlastico(String nombre, String marca) {
        super(nombre, marca);
    }

    @Override
    public void apilar() {

    }
}
