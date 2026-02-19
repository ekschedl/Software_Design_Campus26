package Iterator.IteratorEinkaufstasche;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Einkaufstasche implements Iterable<Artikel> {

    private List<Artikel> artikel;

    // Konstruktor
    public Einkaufstasche() {
        this.artikel = new ArrayList<>();
    }

    // Artikel hinzufügen
    public void addArtikel(Artikel neuerArtikel) {
        artikel.add(neuerArtikel);
    }

    // Artikel abrufen
    public Artikel getArtikel(int index) {
        if (index >= 0 && index < artikel.size()) {
            return artikel.get(index);
        }
        throw new IndexOutOfBoundsException("Index liegt außerhalb des gültigen Bereichs: " + index);
    }

    @Override
    public Iterator<Artikel> iterator() {

        return new ArtikelListeIterator(artikel);
    }
}
