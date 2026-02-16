package a_media_me;

public class MpegPlayer implements IPlayer{
    @Override
    public void play(String file) {
        System.out.println("Playing MPEG file: " + file);
    }

    @Override
    public void stop() {
        System.out.println("Stopping MPEG");
    }

    @Override
    public void pause() {
        System.out.println("Pausing MPEG");
    }
}
