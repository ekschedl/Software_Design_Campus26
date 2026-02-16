package Adapter.MultiMediaPlayer;

public class Main {
    public static void main(String[] args) {
        MultiMediaPlayer multiMediaPlayer=new MultiMediaPlayer();
        MpegPlayer mpegPlayer=new MpegPlayer();
        MP4Player mp4Player= new MP4Player();
        AudioPlayer audioPlayer= new AudioPlayer();
        IPlayer mp2player= new MP2Adapter(audioPlayer);
        IPlayer mp3Player= new MP3Adapter(audioPlayer);
        multiMediaPlayer.registerFormat("mp3",mp3Player);
        multiMediaPlayer.registerFormat("mp2",mp2player);
        multiMediaPlayer.registerFormat("mp4",mp4Player);
        multiMediaPlayer.registerFormat("mpeg",mpegPlayer);

        multiMediaPlayer.play("mp2", "song.mp2");
        multiMediaPlayer.play("mp3", "song2.mp3");
        multiMediaPlayer.play("mp4", "song3.mp4");
        multiMediaPlayer.play("mpeg", "song2.mpeg");

    }
}
