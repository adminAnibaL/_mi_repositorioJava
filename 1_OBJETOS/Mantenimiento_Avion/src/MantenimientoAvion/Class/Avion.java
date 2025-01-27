package MantenimientoAvion.Class;

import MantenimientoAvion.Utils.AvionException;

public class Avion {


    private String marca;
    private String modelo;
    private double consumo;

    // Relación con entidad-Compuesta
    private Deposito deposito;
    private Registro registro;

    public Avion() {
        this.deposito = new Deposito(50);
        this.registro = new Registro();
    }

    public Avion(String marca, String modelo, double consumo) {

        this();
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;

    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    //Calcular la autonomía
    public double calcularAutonomía() throws AvionException {
        if (consumo <= 0) {
            throw new AvionException("El consumo debe ser mayor a 0");
        }
        return deposito.getCantidadActual() / consumo;
    }


}
