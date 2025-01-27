package SuperMercado.models;

import SuperMercado.interfaces.ConDescuento;
import SuperMercado.interfaces.EsLiquido;

public class Detergente implements EsLiquido, ConDescuento {
    private String marca;
    private String tipoEnvase;
    private double precio;
    private double volumen;
    private double descuento;


    // constructor

    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }


    @Override
    public void setDescuento(double descuento) {
        descuento = descuento;

    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return precio - (precio * (descuento / 100.0));
    }

    @Override
    public void setVolumen(double v) {
        volumen = v;

    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String envase) {

        tipoEnvase = envase;
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    @Override
    public String toString() {
        return "Detergente{" +
                "marca='" + marca + '\'' +
                ", tipoEnvase='" + tipoEnvase + '\'' +
                ", precio=" + precio +
                ", volumen=" + volumen +
                ", descuento=" + descuento +
                ", Precio con descuento=" + getPrecioDescuento() +
                '}';
    }
}
