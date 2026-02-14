package ProvisionBerechnen_me;

public class ProvisionFuenfVomUmsatz implements ProvisionBerechnen {

    @Override
    public double berechnen(Mitarbeiter mitarbeiter) {
      return mitarbeiter.getUmsatz()*0.05;
    }

}
