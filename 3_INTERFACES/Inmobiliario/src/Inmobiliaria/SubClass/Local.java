package Inmobiliaria.SubClass;

import Inmobiliaria.ClassAbstract.Inmueble;

import java.util.Objects;

public final class Local extends Inmueble {
    private boolean tieneSalidaHumo;

    public Local() {
    }

    public Local(int id_Inmobiliario, String direccion_Inmueble, double precio_Venta, double metros_Cuadrados, boolean tieneSalidaHumo) {
        super(id_Inmobiliario, direccion_Inmueble, precio_Venta, metros_Cuadrados);
        this.tieneSalidaHumo = tieneSalidaHumo;
    }

    public boolean isTieneSalidaHumo() {
        return tieneSalidaHumo;
    }

    public void setTieneSalidaHumo(boolean tieneSalidaHumo) {
        this.tieneSalidaHumo = tieneSalidaHumo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Local local = (Local) o;
        return tieneSalidaHumo == local.tieneSalidaHumo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tieneSalidaHumo);
    }

    @Override
    public String toString() {
        return "Local{" +
                "tieneSalidaHumo=" + tieneSalidaHumo +
                ", id_Inmobiliario=" + id_Inmobiliario +
                ", direccion_Inmueble='" + direccion_Inmueble + '\'' +
                ", precio_Venta=" + precio_Venta +
                ", metros_Cuadrados=" + metros_Cuadrados +
                '}';
    }
}
