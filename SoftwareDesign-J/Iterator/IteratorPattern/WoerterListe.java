package Iterator.IteratorPattern;

import java.util.Iterator;

//soll meherere Woerter in einem Array speichern können
//ITERABLE muss bei FOR SCHLEIFE implementiert werden!!!!!
public class WoerterListe implements Iterable<String> {

    private String[] text;

    //Leerzeichen ist das Trennzeichen für den übergebenen Paramenter
    //Mein Haus ist grün [Mein, Haus, ist, grün]

    public WoerterListe(String myText) {

        text = myText.split(" ");
    }
    //********Hier muss der WORDLIST - ITERATOR übergeben werden!!!
    //erzeugt passendes Iterator Objekt und übergibt Referenz auf Daten

    @Override
    public Iterator<String> iterator() {
        return new WordListIterator(text);
    }
}
