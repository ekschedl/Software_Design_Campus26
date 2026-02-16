package Strategy_Transporter_me;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        Transporter transporte1=new Transporter("transporter01",10,20 );
        Parcel parcel_01=new Parcel(transporte1,2000,10000);
        Parcel parcel_02=new Parcel(transporte1,20,100);

        System.out.println("Parcel_01:");
        System.out.println(parcel_01.calcPrice(new DistanceStrategy()));
        System.out.println(parcel_01.calcPrice(new WeightStrategy()));

        System.out.println("**********+++++++*++****************");

        System.out.println("Parcel_02:");
        System.out.println(parcel_02.calcPrice(new DistanceStrategy()));
        System.out.println(parcel_02.calcPrice(new WeightStrategy()));

    }
}
