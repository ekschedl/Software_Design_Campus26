package Strategy_Provision;

public class ProvisionsStrategieUmsatz implements ProvisionsStrategie{

    @Override
    public double berechneProvision(Mitarbeiterin m) {
        return m.getUmsatz() * 0.05;
    }
}
