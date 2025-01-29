package Inmobiliaria.ClassAbstract;

import Inmobiliaria.SubClass.Apartamento;
import Inmobiliaria.SubClass.Casa;
import Inmobiliaria.SubClass.Habitacion;

import java.util.Arrays;
import java.util.Objects;

public abstract sealed class InmuebleVivienda extends Inmueble permits Casa, Apartamento {

    private static final int MIN_SIZE_HABITACION = 3;
    protected Habitacion[] habitaciones;
    protected int numHabitaciones;
    protected int numBaños;

    public InmuebleVivienda() {
    }

    public InmuebleVivienda(int id_Inmobiliario, String direccion_Inmueble, double precio_Venta, double metros_Cuadrados, Habitacion[] habitaciones, int numHabitaciones, int numBaños) {
        super(id_Inmobiliario, direccion_Inmueble, precio_Venta, metros_Cuadrados);
        this.habitaciones = habitaciones;
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        InmuebleVivienda that = (InmuebleVivienda) o;
        return numHabitaciones == that.numHabitaciones && numBaños == that.numBaños && Objects.deepEquals(habitaciones, that.habitaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(habitaciones), numHabitaciones, numBaños);
    }

    @Override
    public String toString() {
        return "InmuebleVivienda{" +
                "habitaciones=" + Arrays.toString(habitaciones) +
                ", numHabitaciones=" + numHabitaciones +
                ", numBaños=" + numBaños +
                '}';
    }
}
