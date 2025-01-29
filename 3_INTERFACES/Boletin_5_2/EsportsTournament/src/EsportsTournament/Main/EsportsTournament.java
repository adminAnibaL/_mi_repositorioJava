package EsportsTournament.Main;

import EsportsTournament.Class.FPSGamer;
import EsportsTournament.Class.MOBAGamer;
import EsportsTournament.Class.SportsGamer;
import EsportsTournament.Interfaces.Gamer;
import EsportsTournament.Interfaces.Imprimir;

public class EsportsTournament {


    public static void main(String[] args) {

        //
        //ThinkFast → [Contrato +  nombreObjeto + newTipoDelObjeto]
        FPSGamer obj1 = new FPSGamer();
        Gamer obj2 = new MOBAGamer();
        Gamer obj3 = new SportsGamer();


        // creando un array gamer

        Gamer[] gamers = new Gamer[]{obj1, obj2, obj3};

        startTournament(gamers);


    }

    public static void startTournament(Gamer[] players) {

        for (Gamer gamer : players) {
            gamer.playGamer();
            if (gamer instanceof Imprimir im){
                im.imprimir();
            }

        }





    }
}
