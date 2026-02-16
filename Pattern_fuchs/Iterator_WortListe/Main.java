package Iterator_WortListe;

import java.util.ArrayList;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> meineListe = new ArrayList<>();

        meineListe.add("a");
        meineListe.add("b");
        meineListe.add("c");



        // for each
        for(String elem : meineListe){
            System.out.println(elem);
        }


        // oder alternativ direkt Iterator verwenden (wird oben intern auch verwendet)
        Iterator<String> meinIti = meineListe.iterator();
        while(meinIti.hasNext()){
            String elem = meinIti.next();
            System.out.println(elem);
            // Falls Iteator auch ein remove unterstützt können wir hier auch ein Element entfernen
        }


        // our own class
        WordList wl = new WordList("Hansi hat 20 goldene Schallplatten .");
        for(String word : wl){
            System.out.println(word);
        }







    }
}