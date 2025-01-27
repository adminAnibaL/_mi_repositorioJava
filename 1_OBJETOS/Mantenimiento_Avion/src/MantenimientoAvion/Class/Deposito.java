package MantenimientoAvion.Class;

public class Deposito {
    private final static double CAPACIDAD_MAX = 100;
    private double cantidadActual;

    public Deposito(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }
}
