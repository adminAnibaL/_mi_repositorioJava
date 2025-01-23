package GestionCafeteria.Class;

public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //M() para mostar los productos
    public String mostrarProducto(){
        return "Nombre: " + nombre + " Precio: " + precio;
    }


    // creando get precio
    public double getPrecio() {
        return precio;
    }

}
