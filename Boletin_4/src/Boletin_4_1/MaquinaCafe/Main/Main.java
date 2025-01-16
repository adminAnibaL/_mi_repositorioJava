package Boletin_4_1.MaquinaCafe.Main;

import Boletin_4_1.MaquinaCafe.Class.MaquinaCafe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //CREANDO CAFETERA

        MaquinaCafe coffeAndTe = new MaquinaCafe();


//*******************************************************************************************************

        // Creando un menu para el usuario
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;  // Variable que controlará el bucle

        while (continuar) {

            String[] menuCafetera = {
                    "\n",
                    ". : Menu Cafetería : .",
                    "1) Servir Cafe (1€)",
                    "2) Servir solo Leche (0.80€)",
                    "3) Servir cafe & leche (1.50€)",
                    "4) Consultar depósitos",
                    "5) Apagar máquina",
            };

            for (String menu : menuCafetera) {
                System.out.println(menu);
            }
            System.out.println("Elija una opción [1 - 5]");
            int opcion = sc.nextInt();

            //Creando el switch
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ha elegido café solo");
                    System.out.print("Ingrese el dinero → ");
                    double cantidad = sc.nextDouble();

                    //Mi lógica responde Primero debo asegurarme de que la máquina cuenta con todos los "ingredientes" disponibles


                    coffeAndTe.servirCafeSolo(cantidad);
                    System.out.println("Ha comprado un -BLack-Coffe -");
                }
                case 2 -> {
                    System.out.println("Ha elegido solo leche");
                }
                case 3 -> {
                    System.out.println("Ha elegido cafe con leche");
                }
                case 4 -> {
                    System.out.println("Informe de depósitos");
                    coffeAndTe.mostrarRecursos();
                }
                case 5 -> {
                    System.out.println("... apagando máquina");
                     continuar = false;

                }
                default -> {
                    System.out.println("Opción inválida, por favor elija una opción →  [1 - 5]");
                }

            }

        } // final WHILE

    }

}
