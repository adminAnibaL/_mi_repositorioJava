package com.miapp.main;


import com.miapp.abstractmodels.Vehiculo;
import com.miapp.interfaces.Movible;
import com.miapp.interfaces.Trabajo;
import com.miapp.models.Autobus;
import com.miapp.models.Bicicleta;
import com.miapp.models.Coche;

public class Main {
    public static void main(String[] args) {

        // Creando un esenario con array

        //Vehiculo[] vehiculo = new Vehiculo[] {new Autobus(),new Bicicleta(), new Coche()};

        System.out.println("Gestión de vehiculos del Boletín");
        Vehiculo autobus1 = new Autobus("SociBus", "F32");
        Vehiculo bicicleta1 = new Bicicleta("Bicicleta", "F32");
        Vehiculo coche1 = new Coche("Coche", "F32");
        Vehiculo bicicleta2 = new Bicicleta("Bicicleta-Electrica", "F32");

        probarMovilidad(autobus1);
        probarMovilidad(bicicleta1);
        probarMovilidad(coche1);
        probarCargaYDescarga(coche1);
        probarCargaYDescarga(autobus1);
        probarCargaYDescarga(bicicleta1);
        probarCargaYDescarga(bicicleta2);

    }

    public static void probarMovilidad(Vehiculo veh) {

        if (veh instanceof Movible mov ) {
            mov.acelerar();
            mov.frenar();
        }

    }


    public static void probarCargaYDescarga(Vehiculo veh) {
        if (veh instanceof Trabajo tab) {
            tab.cargarPasajeros();
            tab.descargarPasajeros();
        }else{
            System.out.println("STOP!!! -> El vehiculo [ " + veh.getMarca() + " ] no esta diseñado para esa tarea." );
        }
    }

}
