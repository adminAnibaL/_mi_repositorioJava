package Pc_Ficheros.Models.SubClass.Text;

import Pc_Ficheros.Models.ClassMain.FicheroTexto;

import java.time.LocalDate;

public class TextoPlano extends FicheroTexto {
    public TextoPlano(String nombre, LocalDate fechaCreacion, String[] parrafo) {
        super(nombre, fechaCreacion, parrafo);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Contenido del texto plano:");
        System.out.println(leerContenido());
    }
}
