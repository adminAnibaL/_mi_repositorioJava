package Boletin_4_1.Biblioteca.Utils;

import Boletin_4_1.Biblioteca.Class.Biblioteca;
import Boletin_4_1.Biblioteca.Class.Libro;

public class Funciones {


    public void agregarLibros(Biblioteca biblioteca, Libro libro) throws LibroException {

        //Obtener el arreglo de libros de la biblioteca
        Libro[] listaLibros = biblioteca.getListaLibros();
        // Verificando si el libro ya está en la biblioteca
        for (int i = 0; i < listaLibros.length; i++) {
            if (listaLibros[i] != null && listaLibros[i].getTitulo().equals(libro.getTitulo())) {
                throw new LibroException("El libro '" + libro.getTitulo() + "' ya está agregado en la biblioteca.");
            }
        }
        //Verificando si hay espacio disponible
        boolean espcioDisponible = false;

        for (int i = 0; i < listaLibros.length; i++) {
            if (listaLibros[i] == null) {
                espcioDisponible = true;
                listaLibros[i] = libro; // asignamos el libro en esa posición
                System.out.println(" Libro agregado" + "\t | " + "→ " + libro.getTitulo());
                break;
            }
        }


        if (!espcioDisponible) {
            System.out.println("\n → \"Atención\"");
            throw new LibroException("El libro " + libro.getTitulo() + " " + " [ No cuenta con espacio disponible ]");

        }


    }


    // M() para prestar el libro
    public void prestar(Biblioteca biblioteca, Libro libro) {
        if (!libro.isPrestado()) {
            libro.setPrestado(true);
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' ya está prestado.");
        }
    }

    // M() para devolver el libro
    public void devolver(Biblioteca biblioteca, Libro libro) {
        if (libro.isPrestado()) {
            libro.setPrestado(false);
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no está prestado.");
        }
    }

    // M() para mostrar la información del libro
    public void informacion(Biblioteca biblioteca, Libro libro) {
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("¿Está prestado? " + (libro.isPrestado() ? "Sí" : "No"));
    }

}
