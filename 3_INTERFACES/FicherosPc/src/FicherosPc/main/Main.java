package FicherosPc.main;

import FicherosPc.models.binarios.Audio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Creando un fichero de audio
        Audio audio1=new Audio("Lola baila sola",2000000000L, LocalDate.now());

        audio1.verInfo();
    }
}
