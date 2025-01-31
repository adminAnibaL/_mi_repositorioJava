package com.miapp.models;

import com.miapp.abstractmodels.Juguete;
import com.miapp.abstractmodels.JuguetePlastico;
import com.miapp.enums.Material;
import com.miapp.interfaces.Apilable;

public class PiezasLego extends JuguetePlastico implements Apilable {
    private double longitud;
    private String color;

    public PiezasLego(String nombre, String marca, String descripcion, Material material, double longitud, String color) {
        super(nombre, marca, descripcion, material);
        this.longitud = longitud;
        this.color = color;
    }

    @Override
    public void apliar(Juguete juguete) {

    }
}
