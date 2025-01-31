package Music_Player.models.Entities;

import Music_Player.interfaces.Imprimir;
import Music_Player.interfaces.OfflineMusicPlayer;


public class MP3Player implements  OfflineMusicPlayer, Imprimir {

    public MP3Player() {
    }



    @Override
    public void imprimir() {
        System.out.println("Playing music on MP3 Player");
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
