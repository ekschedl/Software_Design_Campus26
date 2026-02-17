package Decorator_Pizza_interface_me;

public class BasicPizza implements Pizza{

    @Override
    public String getBeschreibung() {
        return "Basic Pizza ";
    }

    @Override
    public double getPreis() {
        return 5.00;
    }
}
