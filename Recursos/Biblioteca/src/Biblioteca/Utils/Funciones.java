package Biblioteca.Utils;

import Biblioteca.Class.Biblioteca;
import Biblioteca.Class.Libro;

public class Funciones {


    public void agregarNuevoLibros(Biblioteca biblioteca, Libro libro) throws BibliotecaException {

        Libro[] array = biblioteca.getCajaLibros();

        boolean stop = false; // Variable bandera que controla la ejecución del bucle

        for (int i = 0; i < array.length && !stop; i++) {
            if (array[i] == null) {
                array[i] = libro;
                stop = true;
            }
        }

        System.out.println("El libro ha sido agregado");
        if (!stop) {
            throw new BibliotecaException("No se ha podido introducir un libro en el array");
        }

    }

// función para Eliminar un Libro


    public void eliminarLibro(Biblioteca biblioteca, Libro libro) {

        Libro[] array = biblioteca.getCajaLibros();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null || array[i].equals(libro.getTitulo())) {
                array[i] = null;
            return;
            }


        }


    }


}
