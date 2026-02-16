package a_media_me;

import java.util.HashMap;
import java.util.Map;

public class MultiMediaPlayer {

    // Map speichert Format -> passenden Player
    private Map<String, IPlayer> formats = new HashMap<>();

    // Registrierung eines Formats mit passendem Player
    void registerFormat(String format, IPlayer player) {
        formats.put(format.toLowerCase(), player);
    }

    // Spielt Datei mit passendem Player
    void play(String format, String file) {

        IPlayer player = formats.get(format.toLowerCase());

        if (player != null) {
            player.play(file);
        } else {
            System.out.println("Format nicht unterstützt: " + format);
        }
    }

}
