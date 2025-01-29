package Inmobiliaria.SubClass;

import Inmobiliaria.ClassAbstract.InmuebleVivienda;

import java.util.Objects;

public class Habitacion  {
    private String uso;
    private int metrosCuadrados;
    private int numVentanas;

    public Habitacion() {
    }

    public Habitacion(String uso, int metrosCuadrados, int numVentanas) {
        this.uso = uso;
        this.metrosCuadrados = metrosCuadrados;
        this.numVentanas = numVentanas;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Habitacion that = (Habitacion) o;
        return metrosCuadrados == that.metrosCuadrados && numVentanas == that.numVentanas && Objects.equals(uso, that.uso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uso, metrosCuadrados, numVentanas);
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "uso='" + uso + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                ", numVentanas=" + numVentanas +
                '}';
    }
}
