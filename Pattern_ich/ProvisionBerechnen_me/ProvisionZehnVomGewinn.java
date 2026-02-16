package ProvisionBerechnen_me;

public class ProvisionZehnVomGewinn implements ProvisionBerechnen {


    @Override
    public double berechnen(Mitarbeiter mitarbeiter) {
        return mitarbeiter.getGewinn()*0.10;
    }

}
