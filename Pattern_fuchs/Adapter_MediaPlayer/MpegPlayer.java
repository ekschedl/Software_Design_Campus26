package Adapter_MediaPlayer;

public class MpegPlayer implements IPlayer {

    @Override
    public void play(String file) {

        System.out.println("Playing mpeg " + file);
    }

}