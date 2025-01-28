package Pc_Ficheros.Models.ClassMain;

import Pc_Ficheros.Interface.Leible;

import java.time.LocalDate;

public abstract class FicheroTexto extends Fichero implements Leible {
    private String[] parrafo;


    public FicheroTexto(String nombre, LocalDate fechaCreacion, long tamaño, String[] parrafo) {
        super(nombre, fechaCreacion, tamaño);
        this.parrafo = parrafo;
    }

    @Override
    public String leerContenido(){
        return String.join("\n", parrafo);
    }
}
