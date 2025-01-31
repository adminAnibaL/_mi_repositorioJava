package com.miapp.modelsAbstract;

public abstract class Juguete {

    // atributos Comunes
    private String nombre;
    private String marca;

    //Constructor Padre
    public Juguete(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
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

    @Override
    public String toString() {
        return "Juguete{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
