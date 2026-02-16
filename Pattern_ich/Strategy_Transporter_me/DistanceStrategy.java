package Strategy_Transporter_me;

public class DistanceStrategy implements Strategy {
    @Override
    public double errechne(Parcel parcel) {
        System.out.println("DistanceStrategy berechnet KilometerFee * Distance: ");
        return parcel.getTransporter().getKilometerFee()*parcel.getDistance();
    }

}
