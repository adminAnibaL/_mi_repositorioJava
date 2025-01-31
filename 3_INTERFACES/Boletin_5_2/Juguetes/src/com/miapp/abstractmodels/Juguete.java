package com.miapp.abstractmodels;

import java.util.Objects;

public abstract class Juguete {
    private String nombre;
    private String marca;
    private String descripcion;

    public Juguete(String nombre, String marca, String descripcion) {
        this.nombre = nombre;
        this.marca = marca;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Juguete juguete = (Juguete) o;
        return Objects.equals(nombre, juguete.nombre) && Objects.equals(marca, juguete.marca) && Objects.equals(descripcion, juguete.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, marca, descripcion);
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
