package Pc_Ficheros.Models.SubClass.Text;

import Pc_Ficheros.Interface.Analizar;
import Pc_Ficheros.Models.ClassMain.FicheroTexto;

import java.time.LocalDate;

public class TextoFormateado extends FicheroTexto implements Analizar {
    private String tipoFuente;
    private int tamañoFuente;
    private String colorFuente;

    public TextoFormateado(String nombre, long tamaño, LocalDate fechaCreacion, String[] parrafo,
                           String tipoFuente, int tamañoFuente, String colorFuente) {
        super(nombre, fechaCreacion, tamaño, parrafo);
        this.tipoFuente = tipoFuente;
        this.tamañoFuente = tamañoFuente;
        this.colorFuente = colorFuente;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fuente: " + tipoFuente + ", Tamaño: " + tamañoFuente + ", Color: " + colorFuente);
    }

    @Override
    public void analizar() {
        System.out.println("Analizando el fichero " + getNombre());
    }
}
