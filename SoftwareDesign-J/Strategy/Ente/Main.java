package Strategy.Ente;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        List<Ente> entenhausen = new ArrayList<>();
        entenhausen.add(new Rotkopfente("Herbert"));
        entenhausen.add(new Stockente("Franz die Stockente"));
        entenhausen.add(new Gummiente("Gustav"));


        for (Ente e:entenhausen) {
            e.anzeigen();
            e.quaken();
            e.performFliegen();
        }
    }
}
