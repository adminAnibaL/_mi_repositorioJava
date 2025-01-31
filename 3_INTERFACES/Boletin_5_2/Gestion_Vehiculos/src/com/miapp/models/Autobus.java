package com.miapp.models;

import com.miapp.abstractmodels.Vehiculo;
import com.miapp.interfaces.Movible;
import com.miapp.interfaces.Trabajo;



public class Autobus extends Vehiculo implements Movible, Trabajo {
    public Autobus(String marca, String modelo) {
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

    @Override
    public void cargarPasajeros() {
        System.out.println("Cargar Pasajeros");
    }

    @Override
    public void descargarPasajeros() {
        System.out.println("Descargar Pasajeros");
    }
}
