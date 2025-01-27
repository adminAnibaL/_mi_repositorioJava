package MantenimientoAvion.Class;


import java.util.ArrayList;

/*Aquí sabremos cuando aviones tenemos */
public class PortaAviones {

    private static int contadorAviones =0;

    private String nombrePortaAvion;
    private static ArrayList<Avion> listaAviones;

    static {

       listaAviones = new ArrayList<>();
       listaAviones.add(new Avion("EuroFigth","Boing 737",20));
       listaAviones.add(new Avion("EuroFigth","Boing 636",20));
       listaAviones.add(new Avion("EuroFigth","Boing 434",20));
       contadorAviones = listaAviones.size();

    }
    // Constructor
    public PortaAviones(String nombrePortaAvion) {
        this.nombrePortaAvion = nombrePortaAvion;
    }

    // M() para agregar un avión al portaaviones
    public void agregarAvion(Avion avion) {
        listaAviones.add(avion);
        contadorAviones++; // Incrementar el contador de aviones
    }

    // M() para eliminar un avión del portaaviones
    public void eliminarAvion(Avion avion) {
        if (listaAviones.remove(avion)) {
            contadorAviones--; // Decrementar el contador de aviones
        }
    }

    // M() para obtener la lista de aviones
    public ArrayList<Avion> getListaAviones() {
        return listaAviones;
    }

    // M() para obtener el número total de aviones
    public static int getContadorAviones() {
        return contadorAviones;
    }

    // M() para obtener el nombre del portaaviones
    public String getNombrePortaAvion() {
        return nombrePortaAvion;
    }

    // M() para establecer el nombre del portaaviones
    public void setNombrePortaAvion(String nombrePortaAvion) {
        this.nombrePortaAvion = nombrePortaAvion;
    }

    // M() para mostrar información de todos los aviones en el portaaviones
    public void mostrarAviones() {
        System.out.println("Aviones en el portaaviones " + nombrePortaAvion + ":");
        for (Avion avion : listaAviones) {
            System.out.println("Marca: " + avion.getMarca() + ", Modelo: " + avion.getModelo() + ", Consumo: " + avion.getConsumo());
        }
    }
}


