package Decorator_Pizza_interface_me;

public class Margherita implements Pizza{
    @Override
    public String getBeschreibung() {
        return "Margherita";
    }

    @Override
    public double getPreis() {
        return 9.00;
    }
}
