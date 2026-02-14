package Observer.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Medienverlag {

    private List<Abonnent> abonnentenList = new ArrayList<>();

    public void addSubscriber(Abonnent thisAbonnent) {
        abonnentenList.add(thisAbonnent);
        System.out.println("Medienverlag: +Subscriber: " + thisAbonnent.getName() + " hinzugefügt");
    }

    public void removeSubscriber(Abonnent thisAbonnent) {
        abonnentenList.remove(thisAbonnent);
    }

    public void veroeffentliche(Artikel artikel) {
        for (Abonnent thisAbonnent : abonnentenList) {
            thisAbonnent.erhalte(artikel);
        }
    }
}
