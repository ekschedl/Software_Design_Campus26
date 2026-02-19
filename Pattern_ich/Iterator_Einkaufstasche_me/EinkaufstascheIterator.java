package Iterator_Einkaufstasche_me;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


public class EinkaufstascheIterator implements Iterator<Artikel>{
    private ArrayList<Artikel> artikelListe;
    private int position;


    public EinkaufstascheIterator(ArrayList<Artikel> artikelListe) {
        this.artikelListe = artikelListe;
        position = 0;
    }

    //Gibt uns die Info ob wir schon am Ende sind oder nicht
    //true falls noch Element vorhanden...false falls wir am Ende sind
    @Override
    public boolean hasNext() {
        return position < artikelListe.size();
    }

    @Override
    public Artikel next() {
       if(!hasNext()){
           throw new NoSuchElementException();
       } else{
           return artikelListe.get(position++);
       }
    }

}