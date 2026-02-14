package Adapter.MultiMediaPlayer;

public class MpegPlayer implements IPlayer{

    @Override
    public void play(String file) {
        System.out.println("MpegPlayer plays: "+file);
    }
}
