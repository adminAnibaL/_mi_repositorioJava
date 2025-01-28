package EsportsTournament.Class;

import EsportsTournament.Interfaces.Gamer;
import EsportsTournament.Interfaces.Imprimir;

public class FPSGamer implements Gamer, Imprimir {
    @Override
    public void playGamer() {

    }

    @Override
    public void imprimir() {
        System.out.println("Playing a First Person Shooter Game");
    }
}
