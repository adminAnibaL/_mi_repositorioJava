package com.miapp.main;




import com.miapp.utils.ConsoleInput;
import com.miapp.utils.FuncionCreacionObjetos;
import com.miapp.utils.JuguetesPredefinidos;

public class MercaJuguete {
    public static void main(String[] args) {
        menuMercaJuguete();

    }

    //Funcion para mostrar un menu


    public static void menuMercaJuguete() {

        boolean continuar = false;
        while (!continuar) {

            System.out.println("******** -  JugueteLandia  -  ********");
            System.out.println("1. Crear una figura de madera");
            System.out.println("2. Crear un instrrumento musical");
            System.out.println("3. Crear un vehículo de plastico");
            System.out.println("4. Crear una pieza Lego");
            System.out.println("5. Apilar un jugete sobre otro"); //-> mostra un listado de juguetes
            int opcion = ConsoleInput.solicitarEnteroEnRango("Elija una opción (1 - 6)", 1, 6);
            switch (opcion) {

                case 1 -> {
                    System.out.println("Ha elegido→ Crear una figura de madera");
                    FuncionCreacionObjetos.crearFiguraMadera();
                    System.out.println("→ Se ha registrado la figura de madera");
                }
                case 2 -> {
                    System.out.println( "Ha elegido→ Crear un instrumento musical");
                }
                case 3 -> {
                    System.out.printf("Ha elegido→ Crear un Vehiculo de plastico");
                }
                case 4 -> {
                    System.out.println("Ha elegido→ Crear una pieza Lego");
                }
                case 5 -> {
                    System.out.println("Ha elegido→ Apilar un jugete sobre otro");
                    JuguetesPredefinidos.mostrarJuguetes();

                }
                case 6 -> {
                    continuar = true;
                    System.out.println("Gracias por su visita");

                }default -> System.out.printf("Opción incorrecta: %s\n", opcion);
            }


        }

    }

}
