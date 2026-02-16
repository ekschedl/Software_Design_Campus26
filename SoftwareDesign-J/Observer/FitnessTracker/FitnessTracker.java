package Observer.FitnessTracker;

import java.util.ArrayList;
import java.util.List;

public class FitnessTracker {

    private List<Geraete> geraeteListe = new ArrayList<Geraete>();

    public void addGeraete(Geraete geraete) {
        geraeteListe.add(geraete);
        System.out.println("FitnessTracker: Gerät hinzugefügt: "+geraete.getName());
    }

    public void removeGeraete(Geraete geraete) {
        geraeteListe.remove(geraete);
    }

    public void veroeffentliche(Fortschritt fortschritt) {
        for (Geraete geraete : geraeteListe) {
            geraete.erhalte(fortschritt);
        }
    }
}

