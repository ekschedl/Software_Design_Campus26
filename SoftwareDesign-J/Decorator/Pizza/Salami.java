package Decorator.Pizza;

public class Salami extends Pizza{
    public Salami() {
        beschreibung = "Magherita";
    }

    @Override
    public double kostet() {
        return 6.50d;
    }
}
