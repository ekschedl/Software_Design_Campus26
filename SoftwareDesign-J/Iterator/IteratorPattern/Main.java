package Iterator.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(12);
        myList.add(42);
        myList.add(92);
        myList.add(80);
        myList.add(101);


        //Iteriere über alle Elemente der Liste
        for (Integer number : myList) {
            System.out.println(number);
        }
        System.out.println("******************");
        //alternative Variante mit Iterator
        Iterator<Integer> myIterator = myList.iterator();

        //hasNext überprüft, ob es noch ein Element gibt das noch nicht durchlaufen wurde
        while (myIterator.hasNext()) {
            //liefert mir das nächste noch nicht verarbeitete Element
            Integer number = myIterator.next();
            System.out.println(number);
        }
        System.out.println("******************");
        WoerterListe woerterListe = new WoerterListe("Hansi sucht ein Haus");

        for (String w : woerterListe) {
            System.out.println(w);
        }
        System.out.println("*******************");

        Iterator<String> woerter= woerterListe.iterator();

        while (woerter.hasNext()) {
            System.out.println(woerter.next());
        }

    }
}
