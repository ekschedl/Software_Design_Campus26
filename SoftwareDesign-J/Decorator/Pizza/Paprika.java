package Decorator.Pizza;

public class Paprika extends ToppingDecorator {
    public Paprika(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getBeschreibung() {
        return pizza.getBeschreibung()+" ,Paprika";
    }

    @Override
    public double kostet() {

        return pizza.kostet()+2.00d;
    }
}
