package Iterator_WortListe;

import java.util.Iterator;

// Our goal: Save a text and allow access to individual words separated by blanks
// in the object we want to iterate over we have to specify the Iterable interface
public class WordList implements Iterable<String>{
    private String[] text;
    public WordList(String text){
        this.text = text.split(" ");
        System.out.println("Wordlist organizes string: " + text);
    }
    // now we could implement methods to access and change individual words

    // we have to return an object that alllows iterating over our object
    @Override
    public Iterator<String> iterator() {
        return new WordListIterator(text);
    }
}
