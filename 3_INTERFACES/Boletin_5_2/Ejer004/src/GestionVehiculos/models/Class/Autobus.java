package GestionVehiculos.models.Class;

import GestionVehiculos.interfaces.Carga;
import GestionVehiculos.interfaces.Movimiento;
import GestionVehiculos.models.AbstractClass.Vehiculo;

public class Autobus extends Vehiculo implements Movimiento, Carga {
    @Override
    public void cargar() {
        StringBuilder sb = new StringBuilder("Soy un autobus_Escolar").append("\n");
        sb.append("Estoy recogiendo estudiantes");
    }

    @Override
    public void descargando() {
        StringBuilder sb = new StringBuilder("Soy un autobus_Escolar").append("\n");
        sb.append("Estoy [DESCARGARDO AL ] ganado");

    }

    @Override
    public void acelerar() {
        StringBuilder sb = new StringBuilder("Soy un autobus_Escolar").append("\n");
        sb.append("Estoy en un [Acelerando]");

    }

    @Override
    public void frenar() {
        StringBuilder sb = new StringBuilder("Soy un autobus_Escolar").append("\n");
        sb.append("Activando , ");

    }
}
