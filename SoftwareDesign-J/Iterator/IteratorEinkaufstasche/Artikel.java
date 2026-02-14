package Iterator.IteratorEinkaufstasche;

public class Artikel {

    protected String name;
    protected int artikelnummer;
    protected double Gewicht;
    protected double Anzahl;

    public Artikel(double anzahl, String name) {
        Anzahl = anzahl;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "Anzahl=" + Anzahl +
                ", name='" + name + '\'' +
                '}';
    }
}
