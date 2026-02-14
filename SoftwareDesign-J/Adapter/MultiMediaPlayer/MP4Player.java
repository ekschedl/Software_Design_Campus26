package Adapter.MultiMediaPlayer;

public class MP4Player implements IPlayer{

    @Override
    public void play(String file) {
        System.out.println("MP4Player plays: "+file);
    }
}
