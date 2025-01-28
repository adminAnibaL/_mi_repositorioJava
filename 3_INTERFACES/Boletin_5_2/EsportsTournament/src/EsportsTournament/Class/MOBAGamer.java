package EsportsTournament.Class;

import EsportsTournament.Interfaces.Gamer;
import EsportsTournament.Interfaces.Imprimir;

public class MOBAGamer implements Gamer, Imprimir {
    @Override
    public void playGamer() {

    }

    @Override
    public void imprimir() {
        System.out.println("Playing a Multiplayer Online Battle Arena Game");
    }
}
