package Observer_mit_SingleTon_MedienVerlag2;

import java.util.ArrayList;
import java.util.List;

public class Medienverlag {
    private List<Abonnent> abonnenten = new ArrayList<Abonnent>();

    public void addSubscriber(Abonnent einAbonnent) {
        System.out.println("Medienverlag: + Subsciber " + einAbonnent.getName());
        abonnenten.add(einAbonnent);
    }

    public void removeSubscriber(Abonnent einAbonnent) {
        abonnenten.remove(einAbonnent);
    }

    public void veroeffentliche(Artikel artikel) {
        for (Abonnent einAbonnent : abonnenten) {
            einAbonnent.erhalte(artikel);
        }
    }
}