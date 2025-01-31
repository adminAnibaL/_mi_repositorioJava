package com.miapp.abstractmodels;

import com.miapp.enums.Material;

import java.util.Objects;

public abstract class JuguetePlastico extends Juguete {
    protected Material material;

    public JuguetePlastico(String nombre, String marca, String descripcion, Material material) {
        super(nombre, marca, descripcion);
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JuguetePlastico that = (JuguetePlastico) o;
        return material == that.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), material);
    }

    @Override
    public String toString() {
        return "JuguetePlastico{" +
                "material=" + material +
                '}';
    }
}
