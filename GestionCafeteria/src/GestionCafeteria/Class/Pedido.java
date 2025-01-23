package GestionCafeteria.Class;

import GestionCafeteria.Utils.CafeteriaException;

public class Pedido {

    private final static int MAX_PRODUCTOS = 20;
    private Producto[] listaProducto;
    private double total;

    public Pedido(double total) {
        this.total = total;
        listaProducto = new Producto[MAX_PRODUCTOS]; //-> espacio para 20 productos
    }


    // m() para agregar Productos al carrito
    public void agregarProducto(Producto producto) throws CafeteriaException {

        for (int i = 0; i < listaProducto.length; i++) {
            if (listaProducto[i] == null) {
                listaProducto[i] = producto;
                return;
            }

        }
        throw new CafeteriaException("No hay espacio en el carrito");

    }

    //m() para calcular el precio total de todos los productos
    public double calcularTotal() throws CafeteriaException {

        double totalPrecio = 0;

        for (int i = 0; i < listaProducto.length; i++) {
            if (listaProducto[i] != null) {
                totalPrecio += listaProducto[i].getPrecio(); // -> // Sumar el precio de cada producto en la lista

            }
        }

        if (totalPrecio == 0) {
            throw new CafeteriaException("No hay productos en el carrito");
        }
        return totalPrecio;
    }


    //m() mostrar Pedido
    public String mostrarPedido() throws CafeteriaException {
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < listaProducto.length; i++) {
            if (listaProducto[i] != null) {
                sb.append(listaProducto[i].mostrarProducto()).append("\n");
            }
        }
        if (sb.length() == 0) {
            throw new CafeteriaException("No hay productos para visualizar");
        }
        return sb.toString();

    }


}
