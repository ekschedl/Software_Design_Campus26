package ProvisionBerechnen_me;


public class Main {
    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter(
                "Maria", 1200, 1000, new ProvisionFuenfVomUmsatz());

        Mitarbeiter m2 = new Mitarbeiter(
                "Peter", 5000, 2000, new ProvisionZehnVomGewinn());

        MitarbeiterManager mm = new MitarbeiterManager();
        mm.addMitarbeietr(m1);
        mm.addMitarbeietr(m2);

        mm.printMitarbeiter();
    }
}
