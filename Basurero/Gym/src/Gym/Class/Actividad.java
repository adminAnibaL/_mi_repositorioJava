package Gym.Class;

public class Actividad {
    private String descripcion;
    private int duracion;
    private int nivelIntensidad;

    public Actividad(String descripcion, int duracion, int nivelIntensidad) {
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.nivelIntensidad = nivelIntensidad;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getNivelIntensidad() {
        return nivelIntensidad;
    }
}
