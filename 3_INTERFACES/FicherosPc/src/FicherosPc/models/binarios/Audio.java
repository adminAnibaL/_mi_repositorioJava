package FicherosPc.models.binarios;

import FicherosPc.models.Fichero;

import java.time.LocalDate;

public class Audio extends Fichero {
    private byte[] contenido;
    private long duracion;


    public Audio(String nombre, long tamaño, LocalDate fechaCreacion) {
        super(nombre, tamaño, fechaCreacion);
        this.contenido = new byte[10];
        this.duracion = duracion;
    }





 /*   @Override
    public void verTamaño(){
        System.out.println("Fichero Audio su tamaño es:"  );
    }

*/
    @Override
    public void verInfo() {
        super.verInfo();
    }

}
