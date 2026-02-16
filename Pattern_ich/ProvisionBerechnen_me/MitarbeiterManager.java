package ProvisionBerechnen_me;

import java.util.ArrayList;

public class MitarbeiterManager {
    ArrayList<Mitarbeiter> mitarbeiter;


    public MitarbeiterManager() {
        mitarbeiter = new ArrayList<Mitarbeiter>();
    }
    public void addMitarbeietr (Mitarbeiter m)
    {
        mitarbeiter.add(m);
    }

    public void printMitarbeiter() {
        for (Mitarbeiter m : mitarbeiter)
            System.out.println(m);
    }

    @Override
    public String toString() {
        return "MitarbeiterManager{" +
                "mitarbeiter=" + mitarbeiter +
                '}';
    }
}

