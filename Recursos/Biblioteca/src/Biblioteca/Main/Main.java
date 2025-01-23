package Biblioteca.Main;

import Biblioteca.Class.Biblioteca;
import Biblioteca.Class.Libro;
import Biblioteca.Utils.BibliotecaException;
import Biblioteca.Utils.Funciones;
import Biblioteca.Utils.MiEntradaSalida;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funciones funcion = new Funciones();

        Biblioteca biblioteca1 = new Biblioteca("Londres");
        //Creacion de Libros


        boolean contiinuar = true;
        int opcion = 0;
        while (contiinuar) {
            String[] menuOpciones = {
                    "1) Ingresar Libro",
                    "2) Eliminar  Libro",
                    "3) Editar Libro",
                    "4) Buscar Libro",
                    "5) Salir",

            };

            for (String menu : menuOpciones) {
                System.out.println(menu);
            }
            System.out.println("Elija una opción");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1 -> {

                    System.out.println("Ha elegido ingresar libro");
                    String titulo = MiEntradaSalida.solicitarCadena("Ingrese el titulo del Libro ");
                    String isbn = MiEntradaSalida.solicitarCadena("Ingrese el isbn del libro");
                    try {

                        funcion.agregarNuevoLibros(biblioteca1, new Libro(titulo, isbn));
                    } catch (BibliotecaException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {//Eliminar libro por título
                    String titulo = MiEntradaSalida.solicitarCadena("Ingrese el nombre del Libro a eliminar");

                             funcion.eliminarLibro(biblioteca1, new Libro(titulo));

                }
                case 3 -> {// Editar libro
                    System.out.println("Ha elegido eliminar  libro");
                }
                case 4 -> {// Buscar libro
                    System.out.println("Ha elegido buscar  libro");
                }
                case 5 -> {//Salir
                    System.out.println("Salir");
                }

                default -> System.out.println("Ha elegido una opción invalida");
            }

        }


    }
}
