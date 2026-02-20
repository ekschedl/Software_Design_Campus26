package Observer_ohne_SingleTon_MedienVerlag1_1i1a;

import java.util.ArrayList;
import java.util.List;

public class Medienverlag {
    private List<Abonnent> abonnenten = new ArrayList<Abonnent>();

    public void veroeffentliche(Artikel artikel) {
        for (Abonnent einAbonnent : abonnenten) {
            einAbonnent.erhalte(artikel);
        }
    }

    public void addSubscriber(Abonnent einAbonnent) {
        System.out.println("Medienverlag: + Subsciber " + einAbonnent.getName());
        abonnenten.add(einAbonnent);
    }

    public void removeSubscriber(Abonnent einAbonnent) {
        abonnenten.remove(einAbonnent);
    }
}