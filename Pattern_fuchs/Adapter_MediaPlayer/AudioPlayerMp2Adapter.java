package Adapter_MediaPlayer;

public class AudioPlayerMp2Adapter implements IPlayer {
    private AudioPlayer audioPlayer;
    public AudioPlayerMp2Adapter(AudioPlayer p) {
        audioPlayer = p;
    }
    @Override
    public void play(String file) {
        audioPlayer.playMp2(file);
    }
}

