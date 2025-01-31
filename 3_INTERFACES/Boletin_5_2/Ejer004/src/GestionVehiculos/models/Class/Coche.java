package GestionVehiculos.models.Class;

import GestionVehiculos.interfaces.Carga;
import GestionVehiculos.interfaces.Movimiento;
import GestionVehiculos.models.AbstractClass.Vehiculo;

public class Coche extends Vehiculo implements Movimiento, Carga {
    @Override
    public void cargar() {

        StringBuilder sb = new StringBuilder("Soy un coche").append("\n");
        sb.append("Estoy [RECOGIENDO] pasajeros").append("\n");
    }

    @Override
    public void descargando() {
        StringBuilder sb = new StringBuilder("Soy un coche").append("\n");
        sb.append("Estoy [DESCARGANDO] pasajeros").append("\n");

    }

    @Override
    public void acelerar() {
        StringBuilder sb = new StringBuilder("Soy un coche").append("\n");
        sb.append("Estoy [ACELERANDO] run run").append("\n");


    }

    @Override
    public void frenar() {
        StringBuilder sb = new StringBuilder("Soy un coche").append("\n");
        sb.append("Estoy [FRENANDO] stop").append("\n");


    }
}
