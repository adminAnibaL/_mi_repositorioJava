package Pc_Ficheros.Models.ClassMain;


import java.time.LocalDate;

public abstract class Fichero  {

    private String nombre;
    private LocalDate fechaCreacion;
    private long tamaño;

    public Fichero(String nombre, LocalDate fechaCreacion, long tamaño) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public long getTamaño() {
        return tamaño;
    }


    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tamaño: " + tamaño + " bytes");
        System.out.println("Fecha de creación: " + fechaCreacion);
    }
}
