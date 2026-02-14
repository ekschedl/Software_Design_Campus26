package Iterator.IteratorPattern;

import java.util.Iterator;
import java.util.function.Consumer;

public class WordListIterator implements Iterator<String> {

    //Struktur die über die andere Datenstruktur iteriert braucht:
    //Bezug zu den Daten
    //aktuelle Position

    private String[] words;
    private int position;

    //Iterator beginnt immer am Anfang!!!!!
    public WordListIterator(String[] words) {
        this.words = words;
        position = 0;

    }
    //Gibt uns die Info ob wir schon am Ende sind oder nicht
    //true falls noch Element vorhanden...false falls wir am Ende sind
    @Override
    public boolean hasNext() {
        if (position < words.length) {
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        if(hasNext()){
            String word = words[position];
            position++;
            return word;
        }
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super String> action) {
        Iterator.super.forEachRemaining(action);
    }
}
