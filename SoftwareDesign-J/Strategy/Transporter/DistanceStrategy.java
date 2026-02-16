package Strategy.Transporter;

public class DistanceStrategy implements PriceStrategy {

    @Override
    public double berechnePreis(Transporter t, Parcel parcel) {
        return t.getKilogramFee()*parcel.getWeight();
    }

    @Override
    public String toString() {
        return "ProvisionUmsatz";
    }
}
