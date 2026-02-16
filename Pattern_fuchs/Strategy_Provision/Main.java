package Strategy_Provision;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MitarbeiterManager mgr = new MitarbeiterManager(new ProvisionsStrategieGewinn());

        mgr.addMitarbeiterin(new Mitarbeiterin("Nala", 100d, 60));
        mgr.addMitarbeiterin(new Mitarbeiterin("Hannah", 100000, 10.45));
        mgr.addMitarbeiterin(new Mitarbeiterin("Kersting Leileigh", 9d, 3d));

        mgr.berechneProvision();
        System.out.println("-------------------");

        mgr.setProvisionsStrategie(new ProvisionsStrategieUmsatz());
        mgr.berechneProvision();
    }
}