package a_media_me;

public class MP4Player implements  IPlayer
{
    @Override
    public void play(String file) {
        System.out.println("Playing MP4 file: " + file);
    }

    @Override
    public void stop() {
        System.out.println("Stopping MP4");
    }

    @Override
    public void pause() {
        System.out.println("Pausing MP4");
    }
}
