package com.miapp.modelsAbstract;


import java.time.LocalDate;

public abstract class JugueteMadera  extends Juguete {
    private LocalDate fechaTala;
    private String origen;

    //Creando constructor Pre-Definido
    public JugueteMadera(String nombre, String marca, LocalDate fechaTala, String origen) {
        super(nombre, marca);
        this.fechaTala = fechaTala;
        this.origen = origen;
    }

    public LocalDate getFechaTala() {
        return fechaTala;
    }

    public void setFechaTala(LocalDate fechaTala) {
        this.fechaTala = fechaTala;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}


