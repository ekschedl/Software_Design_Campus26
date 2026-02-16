package Adapter_MediaPlayer;

public class AudioPlayerMp3Adapter implements IPlayer {

    private AudioPlayer audioPlayer;
    public AudioPlayerMp3Adapter(AudioPlayer p) {
        audioPlayer = p;
    }
    @Override
    public void play(String file) {
        audioPlayer.playMp3(file);
    }
}
