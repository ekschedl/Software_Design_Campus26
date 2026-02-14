package Decorator.Pizza;

public class Schinken extends ToppingDecorator {
    public Schinken(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getBeschreibung() {
        return pizza.getBeschreibung()+" ,Schinken";
    }

    @Override
    public double kostet() {

        return pizza.kostet()+6.00d;
    }
}
