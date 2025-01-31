package com.miapp.models;

import com.miapp.modelsAbstract.JuguetePlastico;
import com.miapp.tipoEnum.Material;

public class PiezaLego extends JuguetePlastico {
    private int longitud;
    private String colorLego;


    public PiezaLego(String nombre, String marca, Material material) {
        super(nombre, marca, Material.ABS);
        this.longitud = longitud;
        this.colorLego = colorLego;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getColorLego() {
        return colorLego;
    }

    @Override
    public String toString() {
        return "PiezaLego{" +
                "longitud=" + longitud +
                ", colorLego='" + colorLego + '\'' +
                '}';
    }
}
