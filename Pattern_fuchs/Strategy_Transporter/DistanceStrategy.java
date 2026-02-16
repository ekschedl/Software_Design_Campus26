package Strategy_Transporter;

public class DistanceStrategy implements IStrategy {

    @Override
    public double calc(Parcel p) {

        return p.getDistance() * p.getTransporter().getKilometerFee();
    }

}
