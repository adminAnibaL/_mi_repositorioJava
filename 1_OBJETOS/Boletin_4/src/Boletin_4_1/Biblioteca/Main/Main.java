package Boletin_4_1.Biblioteca.Main;

import Boletin_4_1.Biblioteca.Class.Biblioteca;
import Boletin_4_1.Biblioteca.Class.Libro;
import Boletin_4_1.Biblioteca.Utils.Funciones;
import Boletin_4_1.Biblioteca.Utils.LibroException;

public class Main {

    public static void main(String[] args) {

        Funciones funcion = new Funciones();
        Biblioteca biblioteca1 = new Biblioteca("Londres");

        Libro libro1 = new Libro("Las 2 torres");
        Libro libro2 = new Libro("Invisible");
        Libro libro3 = new Libro("La Vegetariana");
        Libro libro4 = new Libro("Redes");
        Libro libro5 = new Libro("V de Vicotoria");
        Libro libro6 = new Libro("El Evangelio");


        try {



            funcion.agregarLibros(biblioteca1, libro6);
            funcion.agregarLibros(biblioteca1, libro5);
            funcion.agregarLibros(biblioteca1, libro4);
            funcion.agregarLibros(biblioteca1, libro3);
            funcion.agregarLibros(biblioteca1, libro2);
            funcion.agregarLibros(biblioteca1, libro1);
            funcion.prestar(biblioteca1, libro1);

            funcion.informacion(biblioteca1, libro1);
        } catch (LibroException e) {

            System.out.println("Error! → " + e.getMessage());
        }


    }
}
