package GestionVehiculos.models.Class;

import GestionVehiculos.interfaces.Movimiento;
import GestionVehiculos.models.AbstractClass.Vehiculo;

public class Bicicleta  extends Vehiculo implements Movimiento {
    @Override
    public void acelerar() {
        StringBuilder sb = new StringBuilder("Soy una bicicleta").append("\n");
        sb.append("Estoy [ACELERANDO]");


    }

    @Override
    public void frenar() {
        StringBuilder sb = new StringBuilder("Soy una bicicleta").append("\n");
        sb.append("Estoy [FRENANDO]");
    }
}
