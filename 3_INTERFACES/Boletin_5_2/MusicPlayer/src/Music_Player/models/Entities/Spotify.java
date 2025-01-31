package Music_Player.models.Entities;

import Music_Player.interfaces.Imprimir;

import Music_Player.interfaces.OnlineMusicPlayer;

public class Spotify implements OnlineMusicPlayer, Imprimir {
    public Spotify() {
    }




    @Override
    public void imprimir() {
        System.out.println("Streaming music on Spotify");
    }

    @Override
    public void stream() {

    }

    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }
}
