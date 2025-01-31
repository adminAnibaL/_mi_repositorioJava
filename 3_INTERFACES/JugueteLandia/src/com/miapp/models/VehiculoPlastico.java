package com.miapp.models;

import com.miapp.modelsAbstract.JuguetePlastico;
import com.miapp.tipoEnum.Material;

public class VehiculoPlastico extends JuguetePlastico {

    //Atributos propios
    private int numRuedas;
    private Material material;

    //Creando constructor Pre-Definido
    public VehiculoPlastico(String nombre, String marca, Material material, int numRuedas) {
        super(nombre, marca, Material.PVC);
        this.numRuedas=numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    @Override
    public Material getMaterial() {
        return material;
    }
}
