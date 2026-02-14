package Strategy.Transporter;

import java.util.ArrayList;
import java.util.List;

public class Versandkostenberechnung {
    public static void main(String[] args) {

        // Liste von Paketen erstellen
        List<Parcel> parcels = new ArrayList<>();
        parcels.add(new Parcel(new Transporter("ZUG 1", 23.5, 10.4), 20.0, 200));
        parcels.add(new Parcel(new Transporter("ZUG 2", 50.0, 5.0), 45.7, 400));
        parcels.add(new Parcel(new Transporter("ZUG 3", 79.5, 123.5), 34.1, 700));

        // Strategien anwenden
        PriceStrategy weightStrategy = new WeightStrategy();
        PriceStrategy distanceStrategy = new DistanceStrategy();

        // Preise für jedes Paket berechnen
        for (Parcel parcel : parcels) {
            // Preis nach Gewicht berechnen
            parcel.setStrategy(weightStrategy);
            System.out.println(parcel.getTransporter().getName() + " - Weight Price: " + parcel.calcPrice());

            // Preis nach Entfernung berechnen
            parcel.setStrategy(distanceStrategy);
            System.out.println(parcel.getTransporter().getName() + " - Distance Price: " + parcel.calcPrice());
        }
    }

}

