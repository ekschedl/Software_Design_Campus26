package Decorator_Pizza_interface_me;

public class SalamiDecorator extends PizzaDecorator{
    public SalamiDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getBeschreibung() {
        return super.getBeschreibung() + " mit Salami";
    }

    @Override
    public double getPreis() {
        return super.getPreis() + 1.50;
    }


}
