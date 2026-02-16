package Strategy_Transporter;
public class WeightStrategy implements IStrategy {

    @Override
    public double calc(Parcel p) {

        return p.getWeight() * p.getTransporter().getKilogramFee();
    }

}
