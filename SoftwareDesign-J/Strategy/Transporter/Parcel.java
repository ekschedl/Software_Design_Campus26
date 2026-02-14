package Strategy.Transporter;

public class Parcel {

    protected Transporter transporter;
    protected  double weight;
    protected  int distance;
    private PriceStrategy strategy;

    public Parcel(Transporter transporter, double weight, int distance) {
        this.transporter = transporter;
        this.weight = weight;
        this.distance = distance;
    }

    public double calcPrice() {

        return strategy.berechnePreis(transporter, this);
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
    public void setStrategy(PriceStrategy strategy) {
        this.strategy = strategy;
    }
}
