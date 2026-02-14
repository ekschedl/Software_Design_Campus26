package Iterator.IteratorEinkaufstasche;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ArtikelListeIterator implements Iterator<Artikel> {

    //Struktur die über die andere Datenstruktur iteriert braucht:
    //Bezug zu den Daten
    //aktuelle Position

    private List<Artikel> artikelListe;
    private int position;

    //Iterator beginnt immer am Anfang!!!!!
    public ArtikelListeIterator(List<Artikel> artikelListe) {
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
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in the list");
        }
        return artikelListe.get(position++);
    }
}


