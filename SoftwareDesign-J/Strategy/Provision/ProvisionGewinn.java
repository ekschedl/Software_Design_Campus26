package Strategy.Provision;

public class ProvisionGewinn implements ProvisionStrategie {

    @Override
    public double berechenProvisionEinesMitarbeiters(Mitarbeiter m) {
        return m.getGewinn()*.10;
    }

    @Override
    public String toString() {
        return "ProvisionGewinn";
    }
}
