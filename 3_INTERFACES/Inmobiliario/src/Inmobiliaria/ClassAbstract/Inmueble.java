package Inmobiliaria.ClassAbstract;

import Inmobiliaria.SubClass.Local;


import java.util.Objects;

public abstract sealed class Inmueble permits Local, InmuebleVivienda{
    protected int id_Inmobiliario;
    protected String direccion_Inmueble;
    protected double precio_Venta;
    protected double metros_Cuadrados;

    public Inmueble() {
    }

    public Inmueble(int id_Inmobiliario, String direccion_Inmueble, double precio_Venta, double metros_Cuadrados) {
        this.id_Inmobiliario = id_Inmobiliario;
        this.direccion_Inmueble = direccion_Inmueble;
        this.precio_Venta = precio_Venta;
        this.metros_Cuadrados = metros_Cuadrados;
    }

    public int getId_Inmobiliario() {
        return id_Inmobiliario;
    }

    public void setId_Inmobiliario(int id_Inmobiliario) {
        this.id_Inmobiliario = id_Inmobiliario;
    }

    public String getDireccion_Inmueble() {
        return direccion_Inmueble;
    }

    public void setDireccion_Inmueble(String direccion_Inmueble) {
        this.direccion_Inmueble = direccion_Inmueble;
    }

    public double getPrecio_Venta() {
        return precio_Venta;
    }

    public void setPrecio_Venta(double precio_Venta) {
        this.precio_Venta = precio_Venta;
    }

    public double getMetros_Cuadrados() {
        return metros_Cuadrados;
    }

    public void setMetros_Cuadrados(double metros_Cuadrados) {
        this.metros_Cuadrados = metros_Cuadrados;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inmueble inmueble = (Inmueble) o;
        return id_Inmobiliario == inmueble.id_Inmobiliario && Double.compare(precio_Venta, inmueble.precio_Venta) == 0 && Double.compare(metros_Cuadrados, inmueble.metros_Cuadrados) == 0 && Objects.equals(direccion_Inmueble, inmueble.direccion_Inmueble);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_Inmobiliario, direccion_Inmueble, precio_Venta, metros_Cuadrados);
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "id_Inmobiliario=" + id_Inmobiliario +
                ", direccion_Inmueble='" + direccion_Inmueble + '\'' +
                ", precio_Venta=" + precio_Venta +
                ", metros_Cuadrados=" + metros_Cuadrados +
                '}';
    }
}
