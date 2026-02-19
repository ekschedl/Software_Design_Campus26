package Iterator_Einkaufstasche_me;

public class Artikel {
    private String name;
    private double anzahl;


    public Artikel(String name, double anzahl) {
        this.name = name;
        this.anzahl = anzahl;

    }

    public String getName() {
        return name;
    }

    public double getAnzahl() {
        return anzahl;
    }

    @Override
    public String toString() {
        return name + " (" + anzahl + ")";
    }
}
