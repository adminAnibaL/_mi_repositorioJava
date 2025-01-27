package MantenimientoAvion.Main;

import MantenimientoAvion.Class.Avion;
import MantenimientoAvion.Class.PortaAviones;

public class Main {


    public static void main(String[] args) {
        // Crear un portaaviones
        PortaAviones portaAviones = new PortaAviones("USS Nimitz");

        // Mostrar los aviones iniciales
        portaAviones.mostrarAviones();
        System.out.println("Total de aviones: " + PortaAviones.getContadorAviones());

        // Agregar un nuevo avión
        Avion nuevoAvion = new Avion("F-16", "Fighting Falcon", 15);
        portaAviones.agregarAvion(nuevoAvion);

        // Mostrar los aviones después de agregar uno nuevo
        portaAviones.mostrarAviones();
        System.out.println("Total de aviones: " + PortaAviones.getContadorAviones());

        // Eliminar un avión
        Avion avionAEliminar = portaAviones.getListaAviones().get(0); // Eliminar el primer avión
        portaAviones.eliminarAvion(avionAEliminar);

        // Mostrar los aviones después de eliminar uno
        portaAviones.mostrarAviones();
        System.out.println("Total de aviones: " + PortaAviones.getContadorAviones());
    }
}
