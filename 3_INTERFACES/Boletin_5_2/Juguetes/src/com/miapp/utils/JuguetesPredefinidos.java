package com.miapp.utils;

import com.miapp.abstractmodels.Juguete;
import com.miapp.enums.Material;
import com.miapp.models.FigurasMadera;
import com.miapp.models.InstrumentosMusicales;
import com.miapp.models.PiezasLego;
import com.miapp.models.VehiculosPlastico;

import java.time.LocalDate;

public class JuguetesPredefinidos {
    static Juguete[] cajonDeJuguetes = new Juguete[7];


    static {
        // Inicializar los juguetes en el arreglo
        cajonDeJuguetes[0] = new FigurasMadera("Figura de Madera", "Marca1", "Figura decorativa de madera", "Bosque A", LocalDate.now(), "Rojo", 6);
        cajonDeJuguetes[1] = new PiezasLego("Pieza Lego", "Marca2", "Pieza Lego para construir", Material.PVC, 10, "Azul");
        cajonDeJuguetes[2] = new VehiculosPlastico("Vehículo plástico", "Marca3", "Vehículo de juguete", Material.ABS, 4);
        cajonDeJuguetes[3] = new InstrumentosMusicales("Guitarra", "Marca4", "Instrumento musical", "Bosque B", LocalDate.now(), 5);
        cajonDeJuguetes[4] = new FigurasMadera("Coche de Madera", "Marca6", "Coche de juguete en madera", "Bosque C", LocalDate.now(), "Verde", 4);
        cajonDeJuguetes[5] = new PiezasLego("Construcción Lego", "Marca7", "Piezas Lego para construcción avanzada", Material.PVC, 20, "Rojo");
        cajonDeJuguetes[6] = new VehiculosPlastico("Tractor de plastico", "Marca8", "Tractor de juguete", Material.PVC, 6);
    }

    public static void mostrarJuguetes() {

        System.out.println("***************  - Lista de [JUGUETES] disponibles - ***************");
        // Usando for-each para iterar sobre el arreglo de juguetes
        for (Juguete juguete : cajonDeJuguetes) {
            System.out.println(juguete.getNombre()); // Solo imprimimos el nombre del juguete
        }

    }


}
