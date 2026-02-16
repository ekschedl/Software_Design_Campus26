package Strategy_Provision;

public class ProvisionsStrategieGewinn implements ProvisionsStrategie{

    @Override
    public double berechneProvision(Mitarbeiterin m) {
        return m.getGewinn() * 0.1;
    }
}
