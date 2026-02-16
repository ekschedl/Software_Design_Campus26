package Strategy_Transporter_me;

public class Parcel {
    protected Transporter transporter;
    protected double weight;
    protected int distance;


    public Parcel(Transporter transporter, double weight, int distance) {
        this.transporter = transporter;
        this.weight = weight;
        this.distance = distance;

    }

    public Transporter getTransporter() {
        return transporter;
    }

    public double getWeight() {
        return weight;
    }

    public int getDistance() {
        return distance;
    }

    public double calcPrice(Strategy strategy){

        if (strategy == null) {
            return 0;
        } else {
            return strategy.errechne(this);
        }
    }
}

