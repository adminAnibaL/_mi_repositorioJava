package FicherosPc.models;

import FicherosPc.interfaces.Informacion;

import java.time.LocalDate;

public class Fichero implements Informacion {
    private String nombre;
    private long tamaño;
    private LocalDate fechaCreacion;


    public Fichero(String nombre, long tamaño, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.fechaCreacion = fechaCreacion;
    }


    @Override
    public void verTamaño() {



        System.out.println("El tamaño del fichero es: " + tamaño);

    }

    @Override
    public void verInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Fecha de creación: ").append(fechaCreacion).append("\n");
        sb.append("Tamaño: ").append(tamaño).append("bytes");

        System.out.println(sb.toString());

    }
}


/*
*
* public long getTamaño(){
*  long acomulador 0;
* for
* acomulador
*
* }
* */