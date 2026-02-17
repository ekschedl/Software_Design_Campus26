package Decorator_Pizza_abstract_me;

public class BasicPizza extends Pizza {

    @Override
    public String getBeschreibung() {
        return "Basic Pizza";
    }

    @Override
    public double getPreis() {
        return 5.00;
    }
}
