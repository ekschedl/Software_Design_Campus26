package Strategy.Transporter;

public class WeightStrategy implements PriceStrategy {
    @Override
    public double berechnePreis(Transporter m, Parcel parcel) {
        return m.getKilometerFee()* parcel.getDistance();
    }
    @Override
    public String toString() {
        return "Weight Strategy";
    }
}
