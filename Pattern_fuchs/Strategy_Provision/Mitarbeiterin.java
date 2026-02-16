package Strategy_Provision;

public class Mitarbeiterin {
    private String name;
    private double umsatz;
    private double gewinn;

    public Mitarbeiterin(String name, double umsatz, double gewinn) {
        this.name = name;
        this.umsatz = umsatz;
        this.gewinn = gewinn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    public void setGewinn(double gewinn) {
        this.gewinn = gewinn;
    }

    public String getName() {
        return name;
    }

    public double getUmsatz() {
        return umsatz;
    }

    public double getGewinn() {
        return gewinn;
    }
}
