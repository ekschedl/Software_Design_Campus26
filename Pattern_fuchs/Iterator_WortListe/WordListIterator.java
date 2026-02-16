package Iterator_WortListe;

import java.util.Iterator;

public class WordListIterator implements Iterator<String> {

    private String[] words;
    private int pos;

    public WordListIterator(String[] text){
        words = text;
        pos = 0;
    }

    @Override
    public boolean hasNext() {
        if(pos < words.length){
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        if(hasNext()) {
            String word = words[pos];
            pos++;
            return word;
        }
        return null;

    }
}
