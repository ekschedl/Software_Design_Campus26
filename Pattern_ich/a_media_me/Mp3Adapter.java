package a_media_me;

public class Mp3Adapter implements IPlayer {
    AudioPlayer audioPlayer;

    public Mp3Adapter(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void play(String file) {
        audioPlayer.playMp3(file);
    }

    @Override
    public void stop() {
        audioPlayer.stopAudio();
    }

    @Override
    public void pause() {
        audioPlayer.pauseAudio();

    }
}
