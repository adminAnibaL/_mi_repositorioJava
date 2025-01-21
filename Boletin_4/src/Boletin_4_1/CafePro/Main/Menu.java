package Boletin_4_1.CafePro.Main;

import Boletin_4_1.CafePro.Class.MaquinaCafe;
import Boletin_4_1.CafePro.Utils.CafeException;
import Boletin_4_1.CafePro.Utils.CafeFunciones;

import java.util.Scanner;

public class Menu {


    public static void main(String[] args) {


        MaquinaCafe maquina = new MaquinaCafe();

        CafeFunciones funciones = new CafeFunciones();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n Bienvenido a la máquina de café.");
            System.out.println("\n");
            System.out.println("1. Servir café solo (1 euro)");
            System.out.println("2. Servir leche (0,8 euros)");
            System.out.println("3. Servir café con leche (1,5 euros)");
            System.out.println("4. Consultar estado máquina");
            System.out.println("5. Consultar RECAUDACIÓN");
            System.out.println("6. Apagar máquina y salir");
            System.out.println("\n Elija una opción: → ");

            int opcion = scanner.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad de dinero: ");
                        double cantidad = scanner.nextDouble();
                        funciones.restarRecursos(maquina, cantidad);
                        System.out.println("Café solo servido.");
                        break;
                    case 2:
                        funciones.restarRecursos(maquina, 0.80);
                        System.out.println("Leche servida.");
                        break;
                    case 3:
                        funciones.restarRecursos(maquina, 1.50);
                        System.out.println("Café con leche servido.");
                        break;
                    case 4:
                        funciones.mostrarEstadoMaquina(maquina);
                        break;
                    case 5:
                        funciones.mostrarRecaudacion(maquina);
                        break;
                    case 6:
                        running = false;
                        System.out.println("Apagando máquina. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (CafeException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
