package Adapter_MediaPlayer;

import java.util.HashMap;
import java.util.Map;

public class MultiMediaPlayer {

    private Map<String, IPlayer> formats = new HashMap<String, IPlayer>();

    // Registrieren neues Fomrat mit dem Typ format und dem Player Plugin
    // player
    public void registerFormat(String format, IPlayer player) {

        formats.put(format, player);
    }

    public void play(String format, String file) {

        if (formats.containsKey(format)) {
            IPlayer player = formats.get(format);
            player.play(file);
        }
        else {
            // es gibt keinen passenden Player für Format
            System.out.println("Format not supported");
        }
    }



}