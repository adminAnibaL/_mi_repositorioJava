package EsportsTournament.Main;

import EsportsTournament.Class.FPSGamer;
import EsportsTournament.Class.MOBAGamer;
import EsportsTournament.Class.SportsGamer;
import EsportsTournament.Interfaces.Gamer;
import EsportsTournament.Interfaces.Imprimir;

public class EsportsTournament {


    public static void main(String[] args) {

        //ThinkFast → [Contrato +  nombreObjeto + newTipoDelObjeto]

        // creando un array gamer
        Gamer[] gamers = new Gamer[]{new FPSGamer(), new MOBAGamer(), new SportsGamer()};

        startTournament(gamers);


    }

    public static void startTournament(Gamer[] players) {

        for (Gamer gamer : players) {
            gamer.playGamer();
            if (gamer instanceof Imprimir im) {// Verifica si el objeto implementa la interfaz Imprimir
                im.imprimir();
            }

        }
    }
}
