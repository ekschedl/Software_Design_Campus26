package Strategy.Provision;

public class ProvisionUmsatz implements ProvisionStrategie{
    @Override
    public double berechenProvisionEinesMitarbeiters(Mitarbeiter m) {
        return m.getUmsatz()*0.05;
    }

    @Override
    public String toString() {
        return "ProvisionUmsatz";
    }
}
