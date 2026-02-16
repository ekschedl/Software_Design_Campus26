package Strategy.Transporter;

public class Transporter {
    private String name;
    private double kilometerFee;
    private double kilogramFee;

    public Transporter(String name, double kilometerFee, double kilogramFee) {
        this.name = name;
        this.kilometerFee = kilometerFee;
        this.kilogramFee = kilogramFee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKilometerFee() {
        return kilometerFee;
    }

    public void setKilometerFee(double kilometerFee) {
        this.kilometerFee = kilometerFee;
    }

    public double getKilogramFee() {
        return kilogramFee;
    }

    public void setKilogramFee(double kilogramFee) {
        this.kilogramFee = kilogramFee;
    }
}
