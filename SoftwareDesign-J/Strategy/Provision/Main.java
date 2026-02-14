package Strategy.Provision;

public class Main {
    public static void main(String[] args) {
        MitarbeiterManager manager = new MitarbeiterManager(new ProvisionUmsatz());
        manager.addMitarbeiter(new Mitarbeiter("Hans", 200, 100));
        manager.addMitarbeiter(new Mitarbeiter("Hugo", 300, 2));
        manager.addMitarbeiter(new Mitarbeiter("Gustav", 400, 5));
        manager.addMitarbeiter(new Mitarbeiter("Bruno", 800, 20));

        manager.berechneProvision();

        manager.setProvision(new ProvisionGewinn());
        manager.berechneProvision();

    }
}
