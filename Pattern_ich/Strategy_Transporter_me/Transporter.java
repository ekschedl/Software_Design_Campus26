package Strategy_Transporter_me;

public class Transporter {
    protected String name;
    protected double KilometerFee; // Kosten pro km
    protected double kilogramFee; // Kosten pro kg

    public Transporter(String name, double kilometerFee, double kilogramFee) {
        this.name = name;
        KilometerFee = kilometerFee;
        this.kilogramFee = kilogramFee;
    }

    public String getName() {
        return name;
    }

    public double getKilometerFee() {
        return KilometerFee;
    }

    public double getKilogramFee() {
        return kilogramFee;
    }
}
