package Decorator.Pizza;

public class Magherita extends Pizza{
    public Magherita() {
        beschreibung = "Magherita";
    }

    @Override
    public double kostet() {
        return 5.00d;
    }
}
