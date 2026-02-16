package Adapter.MultiMediaPlayer;

public class MP3Adapter implements IPlayer{
private AudioPlayer audioPlayer;

    public MP3Adapter(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void play(String file) {
        audioPlayer.playMp3(file);
    }
}
