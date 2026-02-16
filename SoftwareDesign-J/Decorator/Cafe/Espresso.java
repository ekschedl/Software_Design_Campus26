package Decorator.Cafe;

public class Espresso extends Getraenk{
    public Espresso() {
        beschreibung = "Espresso";
    }

    @Override
    public double kostet() {
        System.out.println("Espresso kostet: 2.50E");
        return 2.50d;
    }
}
