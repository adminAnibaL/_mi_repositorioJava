package com.miApp.main;

import com.miApp.abstractmodels.Juguete;
import com.miApp.models.FiguraMadera;
import com.miApp.models.InstrumentoMusical;
import com.miApp.models.PiezaLego;
import com.miApp.models.VehiculoPlastico;

import java.time.LocalDate;

public class MercaJuguete {

    static Juguete[] cajonJuguetes = new Juguete[]{new FiguraMadera("Brazil", LocalDate.now()), new InstrumentoMusical("Spain", LocalDate.Of.now()), new PiezaLego("Brazo","Lego"), new VehiculoPlastico("Tractor","Toyota")};


    public static void main(String[] args) {

        mostraListraJuguetes(cajonJuguetes);
    }


    //Mostrar lista de Juguetes

    public static void mostraListraJuguetes(Juguete[] juguete){

        for (Juguete jug: cajonJuguetes){
            System.out.println(jug.getNombre());
        }
    }


}
