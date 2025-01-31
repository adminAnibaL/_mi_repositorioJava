package com.miapp.models;

import com.miapp.abstractmodels.JuguetePlastico;
import com.miapp.enums.Material;
import com.miapp.interfaces.Apilable;

public class VehiculosPlastico extends JuguetePlastico implements Apilable {

    private int numeroRuedas;

    public VehiculosPlastico(String nombre, String marca, String descripcion, Material material, int numeroRuedas) {
        super(nombre, marca, descripcion, material);
        this.numeroRuedas = numeroRuedas;
    }


    @Override
    public void apliar() {
        System.out.println("Soy un vehiculo del tipo " + material.PVC);
    }
}
