package Decorator_Pizza_abstract_me;

public class OlivenDecorator extends PizzaDecorator {
    public OlivenDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getBeschreibung() {
        return super.getBeschreibung() +" mit Oliven";
    }

    @Override
    public double getPreis() {
        return super.getPreis() +0.80;
    }
}
