package com.miapp.abstractmodels;

import java.time.LocalDate;
import java.util.Objects;

public abstract class JugueteMadera extends Juguete {

    private String origen;
    private LocalDate fechaTala;


    public JugueteMadera(String nombre, String marca, String descripcion, String origen, LocalDate fechaTala) {
        super(nombre, marca, descripcion);
        this.origen = origen;
        this.fechaTala = fechaTala;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public LocalDate getFechaTala() {
        return fechaTala;
    }

    public void setFechaTala(LocalDate fechaTala) {
        this.fechaTala = fechaTala;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JugueteMadera that = (JugueteMadera) o;
        return Objects.equals(origen, that.origen) && Objects.equals(fechaTala, that.fechaTala);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), origen, fechaTala);
    }

    @Override
    public String toString() {
        return "JugueteMadera{" +
                "origen='" + origen + '\'' +
                ", fechaTala=" + fechaTala +
                '}';
    }
}
