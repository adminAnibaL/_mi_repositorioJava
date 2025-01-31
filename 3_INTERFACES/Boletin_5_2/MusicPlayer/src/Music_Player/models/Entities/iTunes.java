package Music_Player.models.Entities;

import Music_Player.interfaces.Imprimir;
import Music_Player.interfaces.OfflineMusicPlayer;
import Music_Player.interfaces.OnlineMusicPlayer;

public class iTunes implements OfflineMusicPlayer, Imprimir {

    public iTunes() {
    }




    @Override
    public void imprimir() {
        System.out.println("Loading music on iTunes");
    }

    @Override
    public void load() {

    }

    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }
}
