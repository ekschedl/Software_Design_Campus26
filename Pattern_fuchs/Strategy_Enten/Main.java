package Strategy_Enten;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Ente> entenhausen = new ArrayList<Ente>();

        entenhausen.add(new Rotkopfente("Fritz Rorr"));
        entenhausen.add(new Stockente("Eggbert Stock"));
        entenhausen.add(new Gummiente("Sandra die Gummiente"));

        for(Ente e : entenhausen){
            e.anzeigen();
            e.quaken();
            e.performFliegen();
        }
    }
}