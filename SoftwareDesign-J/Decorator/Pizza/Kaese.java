package Decorator.Pizza;

public class Kaese extends ToppingDecorator {
    public Kaese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getBeschreibung() {
        return pizza.getBeschreibung()+" ,Kaese";
    }

    @Override
    public double kostet() {

        return pizza.kostet()+5.00d;
    }
}
