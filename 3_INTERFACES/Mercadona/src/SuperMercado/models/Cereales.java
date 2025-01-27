package SuperMercado.models;

import SuperMercado.interfaces.EsAlimento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cereales implements EsAlimento {
    private String marca;
    private double precio;
    private String tipoCereal;
    private LocalDate caducidad;

    public Cereales(String marca, double precio, String tipoCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        caducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }

    @Override
    public int getCalorias() {
        if (tipoCereal.equalsIgnoreCase("espelta")) {
            return 5;
        } else if (tipoCereal.equalsIgnoreCase("maíz")) {
            return 8;

        } else if (tipoCereal.equalsIgnoreCase("trigo")) {
            return 12;

        } else {
            return 15;
        }
    }

    @Override
    public String toString() {
        return "Cereales{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", tipoCereal='" + tipoCereal + '\'' +
                ", caducidad=" + caducidad.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", calorías=" + getCalorias() +
                '}';
    }
}
