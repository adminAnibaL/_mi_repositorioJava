package Gym.Class;



public class PlanEntrenamiento {


    private String nombre;
    private Actividad[] actividades;


    public PlanEntrenamiento(String nombre) {
        this.nombre = nombre;
        this.actividades = new Actividad[10]; //suponiendo que puede tener hasta 10 actividades
    }

    public String getNombre() {
        return nombre;
    }

    public Actividad[] getActividades() {
        return actividades;
    }


    //m() para agregar actividades al plan

    public void agregarActividad(Actividad actividad, int index){
        if(index > 0 && index < actividades.length){
            actividades[index] = actividad;
        }else{
            System.out.println("Indice fuera de rango");
        }
    }




}
