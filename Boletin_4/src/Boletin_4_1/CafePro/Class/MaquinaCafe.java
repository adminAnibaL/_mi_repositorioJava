package Boletin_4_1.CafePro.Class;


public class MaquinaCafe {
    private static final double CAFE_SOLO = 1.00;
    private static final double SOLO_LECHE = 0.80;
    private static final double CAFE_CON_LECHE = 1.50;


    private int depositoCafe;
    private int depositoLeche;
    private int depositoVasos;

    private double monedero;


    public MaquinaCafe(int depositoCafe, int depositoLeche, int depositoVasos, double monedero) {
        this.depositoCafe = depositoCafe;
        this.depositoLeche = depositoLeche;
        this.depositoVasos = depositoVasos;
        this.monedero = monedero;
    }

    public MaquinaCafe() {
        this.depositoCafe = 50;
        this.depositoLeche = 50;
        this.depositoVasos = 80;
        this.monedero = 30.0; // → Se inicia con un FONDO DE CAJA de 30€
    }


    public int getDepositoCafe() {
        return depositoCafe;
    }

    public int getDepositoLeche() {
        return depositoLeche;
    }

    public int getDepositoVasos() {
        return depositoVasos;
    }

    public double getMonedero() {
        return monedero;
    }

    public void setDepositoCafe(int depositoCafe) {
        this.depositoCafe = depositoCafe;
    }

    public void setDepositoLeche(int depositoLeche) {
        this.depositoLeche = depositoLeche;
    }

    public void setDepositoVasos(int depositoVasos) {
        this.depositoVasos = depositoVasos;
    }

    public void setMonedero(double monedero) {
        this.monedero = monedero;
    }

    public void agregarAlMonedero(double cantidad) {
        this.monedero += cantidad;  // Sumar la cantidad al monedero
    }


}



