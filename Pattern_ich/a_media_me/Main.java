package a_media_me;

public class Main {
    public static void main(String[] args) {
        // MultiMediaPlayer erstellen
        MultiMediaPlayer player = new MultiMediaPlayer();

        // Standard Player registrieren
        player.registerFormat("mpeg", new MpegPlayer());
        player.registerFormat("mp4", new MP4Player());

        // Legacy AudioPlayer erstellen
        AudioPlayer audioPlayer = new AudioPlayer();

        // Adapter registrieren
        player.registerFormat("mp3", new Mp3Adapter(audioPlayer));

        // Tests
        player.play("mpeg", "video1.mpeg");
        player.play("mp4", "video2.mp4");
        player.play("mp3", "song1.mp3");
        player.play("mp2", "song2.mp2");
        player.play("avi", "movie.avi");
    }
}
/*
👉 MPEG und MP4 funktionieren direkt.
👉 MP3 funktioniert – obwohl AudioPlayer kein IPlayer implementiert.
 */