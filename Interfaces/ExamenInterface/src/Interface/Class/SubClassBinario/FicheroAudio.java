package Interface.Class.SubClassBinario;

import Interface.Class.ClassAbstract.FicheroBinario;

import java.time.LocalDate;


public class FicheroAudio extends FicheroBinario {
    private long duracionSegundos;
    // private String [] contenidoArray;

    public FicheroAudio(String nombre, double medidaTam, LocalDate fechaCreacion) {
        super(nombre, medidaTam, fechaCreacion);
    }

    public FicheroAudio(String nombre, double medidaTam, LocalDate fechaCreacion,  long duracionSegundos) {
        super(nombre, medidaTam, fechaCreacion);
        this.duracionSegundos = duracionSegundos;
    }


@Override
public  void mostrarInfo(){
        super.mostrarInfo();
    System.out.println("Duración: " + duracionSegundos + " segundos");
}

}
