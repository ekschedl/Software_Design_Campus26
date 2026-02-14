package Iterator.IteratorEinkaufstasche;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Einkaufstasche einkaufstasche = new Einkaufstasche();

        // Artikel hinzufügen
        einkaufstasche.addArtikel(new Artikel(2, "Apfel"));
        einkaufstasche.addArtikel(new Artikel(1, "Banane"));
        einkaufstasche.addArtikel(new Artikel(3, "Orange"));

        // Artikel abrufen
        System.out.println("Artikel an Position 1: " + einkaufstasche.getArtikel(1)); // Banane

        // Iteration über Artikel
        System.out.println("Alle Artikel:");
        for (Artikel artikel : einkaufstasche) {
            System.out.println(artikel);
        }

        Iterator<Artikel> exceptionIterator = einkaufstasche.iterator();
        exceptionIterator.next();
        exceptionIterator.next();
        exceptionIterator.next();
        exceptionIterator.next();
        
    }
}


