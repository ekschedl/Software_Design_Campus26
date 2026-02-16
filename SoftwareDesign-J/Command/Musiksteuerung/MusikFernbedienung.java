package Command.Musiksteuerung;

import java.util.HashMap;
import java.util.Map;

public class MusikFernbedienung {
    Map<Integer, Kommando> kommandos = new HashMap<Integer, Kommando>();

    public void setKommandos(Integer slot, Kommando kommando) {
        kommandos.put(slot, kommando);
    }
    public void knopfDruecken(Integer knopf){
        if(kommandos.containsKey(knopf)){
            Kommando kommando = kommandos.get(knopf);
            kommando.ausfuehren();
        }

    }
}
