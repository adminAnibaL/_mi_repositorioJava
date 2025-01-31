package com.miapp.models;

import com.miapp.abstractmodels.Vehiculo;
import com.miapp.interfaces.Movible;

import java.io.Serializable;

public class Bicicleta extends Vehiculo implements Movible {
    public Bicicleta(String marca, String modelo) {
        super(marca, modelo);
    }



    @Override
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando...");
    }
}
