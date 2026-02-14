package ProvisionBerechnen_me;


public class Mitarbeiter {
    private String name;
    private double umsatz;
    private double gewinn;
private ProvisionBerechnen provisionBerechnen;

    public Mitarbeiter(String name, double umsatz, double gewinn, ProvisionBerechnen provisionBerechnen) {
        this.name = name;
        this.umsatz = umsatz;
        this.gewinn = gewinn;
        this.provisionBerechnen = provisionBerechnen;
    }

    public double berechneProvision() {
        return provisionBerechnen.berechnen(this);
    }

    public void setProvisionBerechnen(ProvisionBerechnen provisionBerechnen) {
        this.provisionBerechnen = provisionBerechnen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUmsatz() {
        return umsatz;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    public double getGewinn() {
        return gewinn;
    }

    public void setGewinn(double gewinn) {
        this.gewinn = gewinn;
    }


    @Override
    public String toString() {
        return name +
                " | Umsatz: " + umsatz +
                " | Gewinn: " + gewinn +
                " | Provision: " + berechneProvision();
    }
}

