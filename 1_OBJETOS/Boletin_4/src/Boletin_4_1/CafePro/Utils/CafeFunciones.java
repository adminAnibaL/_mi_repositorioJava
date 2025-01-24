package Boletin_4_1.CafePro.Utils;

import Boletin_4_1.CafePro.Class.MaquinaCafe;

public class CafeFunciones {

    private int productosVendidos = 0;
    private double totalRecaudado = 0.0;

    //Comprobando que la máquina disponga de los recursos sufientes para realizar el trabajo

    public boolean compruebaMaquina(MaquinaCafe maquina) throws CafeException {
        if (maquina.getDepositoCafe() < 1 || maquina.getDepositoLeche() < 1 || maquina.getDepositoVasos() < 1) {
            throw new CafeException("No hay recursos suficientes para realizar la operación");
        }
        return true;
    }

    //Comprobando que el monedero tenga suficiente dinero para realizar la operación

    public boolean compruebaMonedero(MaquinaCafe maquina, double cantidad) throws CafeException {
        if (maquina.getMonedero() < cantidad) {
            throw new CafeException("No hay dinero suficiente para realizar la operación");
        }
        return true;
    }



    //Restando los recursos utilizados en la operación
    public void restarRecursos(MaquinaCafe maquina, double cantidad) throws CafeException {

        if (compruebaMaquina(maquina) && compruebaMonedero(maquina, cantidad)) {
            maquina.setDepositoCafe(maquina.getDepositoCafe() - 1);
            maquina.setDepositoLeche(maquina.getDepositoLeche() - 1);
            maquina.setDepositoVasos(maquina.getDepositoVasos() - 1);
            maquina.setMonedero(maquina.getMonedero() - cantidad);


            // Actualizar el monedero
            maquina.agregarAlMonedero(cantidad);  // Agregar el precio al monedero

            // Restar el precio del monedero (por si es necesario, aunque no parece necesario aquí)
            maquina.setMonedero(maquina.getMonedero() - cantidad);  // Esto no es necesario en tu caso, solo si es relevante

            // Actualizar los contadores de productos vendidos y recaudación
            productosVendidos++;
            totalRecaudado += cantidad;

        } else {

            throw new CafeException("Algo a salido mal, no se ha podido realizar la operación");
        }
    }


    public void mostrarEstadoMaquina(MaquinaCafe maquina) {
        System.out.println("Estado de la máquina:");
        System.out.println("Depósito de café: " + maquina.getDepositoCafe());
        System.out.println("Depósito de leche: " + maquina.getDepositoLeche());
        System.out.println("Depósito de vasos: " + maquina.getDepositoVasos());
        System.out.println("Monedero: " + maquina.getMonedero() + " euros");
    }

    // Mostrar solo la recaudación total y productos vendidos
    public void mostrarRecaudacion(MaquinaCafe maquina) {
        System.out.println("Total de productos vendidos: " + productosVendidos);
        System.out.println("Recaudación total: " + totalRecaudado + " €");
    }




}