package GestionCafeteria.Main;

import GestionCafeteria.Class.Pedido;
import GestionCafeteria.Class.Producto;
import GestionCafeteria.Utils.CafeteriaException;
import GestionCafeteria.Utils.ConsoleInput;


public class Main {
    public static void main(String[] args) {
        ConsoleInput consoleInput = new ConsoleInput();

        Pedido pedido = new Pedido(0);

        System.out.println("Bienvenido al Sistema Gestion de pedidos de la Cafeteria");

        int opcion = 0;
        while (opcion != 4) {
            opcion = ConsoleInput.seleccionarOpcion("Elige una opción", new String[]{
                    "Agregar producto al pedido",
                    "Mostrar productos del pedido",
                    "Calcular total del pedido",
                    "Salir"
            });

            switch (opcion) {
                // pedir Información al usuario
                case 1 -> {
                    String nombreProducto = ConsoleInput.solicitarCadena("Introduce el nombre del producto: ");
                    Double precioProducto = ConsoleInput.solicitarDoublePositivo("Ingresa el precio del producto");
                    // creamos el producto
                    Producto producto1 = new Producto(nombreProducto, precioProducto);
                    //agregando el producto al pedido
                    try {
                        pedido.agregarProducto(producto1);
                        System.out.println("Producto agregado con éxito");
                    } catch (CafeteriaException e) {
                        System.err.println(e.getMessage());
                    }

                }
                case 2 -> {
                    try {
                        System.out.println("Productos del pedido");
                        System.out.println(pedido.mostrarPedido());
                    } catch (CafeteriaException e) {
                        System.err.println(e.getMessage());
                    }

                }

                case 3 -> {
                    try {
                        System.out.println("Productos del pedido");
                        double total = pedido.calcularTotal();
                        System.out.printf("El precio del pedido es : %.2f%n", total);
                    } catch (CafeteriaException e) {
                        System.err.println(e.getMessage());
                    }

                }
                case 4 -> System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
                default -> System.out.println("Opción no válida. Por favor, intenta nuevamente.");
            }

        }

    }


}
