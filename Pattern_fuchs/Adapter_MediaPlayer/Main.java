package Adapter_MediaPlayer;

public class Main {
    public static void main(String[] args) {

        MultiMediaPlayer player = new MultiMediaPlayer();
        player.registerFormat("mp4", new Mp4Player());
        player.registerFormat("mpeg", new MpegPlayer());

        player.play("mp4", "C:\\temp\\test.mp4");
        player.play("mpeg", "C:\\temp\\video.mpeg");
        player.play("mpeg", "C:\\temp\\video2.mpeg");
        player.play("mp4", "C:\\temp\\hello.mp4");
        player.play("mp4", "C:\\temp\\world.mp4");


        // gesondert verwendet ohne ihn zu integrieren
        // nur zu demonstrationszwecken (ist nicht notwendig)
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.playMp3("C:\\music.mp3");

        // hier die korrekte einbindung mit den neuen adapterklassen
        player.registerFormat("mp3", new AudioPlayerMp3Adapter(audioPlayer));
        player.registerFormat("mp2", new AudioPlayerMp2Adapter(audioPlayer));

        player.play("mp3", "C:\\better-music.mp3");
        player.play("mp2", "C:\\music.mp2");


    }
}
