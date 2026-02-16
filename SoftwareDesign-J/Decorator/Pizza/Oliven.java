package Decorator.Pizza;

public class Oliven extends ToppingDecorator {
    public Oliven(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getBeschreibung() {
        return pizza.getBeschreibung()+" ,Oliven";
    }

    @Override
    public double kostet() {

        return pizza.kostet()+3.00d;
    }
}
