package Iterator_Einkaufstasche_me;

import java.util.ArrayList;
import java.util.Iterator;

public class Einkaufstasche implements Iterable<Artikel> {
    private ArrayList<Artikel> listeArtikel;

    public Einkaufstasche() {
        this.listeArtikel = new ArrayList<>();
    }

    public void addArtikel(Artikel artikel){
        listeArtikel.add(artikel);
    }

    public void removeArtikel(Artikel artikel){
        listeArtikel.remove(artikel);
    }


    // Iterator zurückgeben
    @Override
    public Iterator<Artikel> iterator() {
        return new EinkaufstascheIterator(listeArtikel);
    }
}

