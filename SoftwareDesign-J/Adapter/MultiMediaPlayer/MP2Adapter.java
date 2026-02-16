package Adapter.MultiMediaPlayer;

public class MP2Adapter implements IPlayer{
private AudioPlayer audioPlayer;

    public MP2Adapter(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void play(String file) {
        audioPlayer.playMp2(file);
    }
}
