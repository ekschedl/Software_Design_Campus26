package Strategy_Transporter_me;

public class WeightStrategy implements Strategy {
    @Override
    public double errechne(Parcel parcel) {
        System.out.println("WeightStrategy berechnet KilogramFee*Weight : ");
        return parcel.getTransporter().getKilogramFee()*parcel.getWeight();
    }


}