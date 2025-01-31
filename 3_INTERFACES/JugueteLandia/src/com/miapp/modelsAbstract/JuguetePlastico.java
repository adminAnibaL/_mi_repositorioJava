package com.miapp.modelsAbstract;

import com.miapp.tipoEnum.Material;

public class JuguetePlastico extends Juguete {
    private Material material;

    public JuguetePlastico(String nombre, String marca, Material material) {
        super(nombre, marca);
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "JuguetePlastico{" +
                "material=" + material +
                '}';
    }
}
