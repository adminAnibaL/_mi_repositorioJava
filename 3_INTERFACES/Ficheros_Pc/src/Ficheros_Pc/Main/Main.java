package Interface.Main;

import Interface.Class.SubClassBinario.FicheroAudio;
import Interface.Utils.ConsoleInput;


import java.time.LocalDate;
import java.util.Scanner;

public class Main {


    //Principal

    public static void main(String[] args) {


        //Creando menu con la clase ConsoleInput
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int opcion = 0;

        while (true) {

            ConsoleInput.seleccionarOpcion(
                    "Creación de Fichero Audio",
                    new String[]
                            {
                                    " Crear Fichero Audio",
                                    " Crear Fichero Video",
                                    " Salir",
                            }
            );


            System.out.println("Elija Opción");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese nombre del Fichero");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese el tamaño en bytes");
                    double medidaTam = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Ingrese la fecha de creación (dd/MM/yyyy)");
                    String fechaStr = sc.nextLine();  // Obtener la entrada del usuario
                    LocalDate fechaCreacion = ConsoleInput.solicitarFecha(fechaStr);

                    System.out.println("Ingrese la duracion");
                    long duracion = sc.nextLong();
                    sc.nextLine();


                    // Creando el Objeto Fichero con todos sus atributos
                     FicheroAudio fAudio = new FicheroAudio (nombre, medidaTam, fechaCreacion, duracion);

                     fAudio.mostrarInfo();

                }

                default -> {
                    System.out.println("Opcion no válida");
                    continuar = false;
                }
            }

            if (!continuar) {
                break;
            }

        }
        sc.close();


    }
}
