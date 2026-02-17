package Decorator_Pizza_abstract_me;

public class Margherita extends Pizza {
    @Override
    public String getBeschreibung() {
        return "Margherita";
    }

    @Override
    public double getPreis() {
        return 9.00;
    }
}
