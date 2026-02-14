package Strategy.Provision;

import java.util.ArrayList;
import java.util.List;

public class MitarbeiterManager {
    private List<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
    private ProvisionStrategie provisionStrategie;

    public MitarbeiterManager(ProvisionStrategie provisionStrategie) {

        this.provisionStrategie = provisionStrategie;
    }

    public void setProvision(ProvisionStrategie p) {
        provisionStrategie = p;
        System.out.println("Mitarbeiter meldet: " + p + " ist die Provisionsstrategie");

    }

    public void addMitarbeiter(Mitarbeiter m) {
        mitarbeiterListe.add(m);
    }

    public void berechneProvision() {
        if (provisionStrategie == null) {
            return;
        }
        for (Mitarbeiter m : mitarbeiterListe) {
            System.out.println("berechne für " + m.getName() + " die Provision: " + provisionStrategie.berechenProvisionEinesMitarbeiters(m));
        }
    }

}
