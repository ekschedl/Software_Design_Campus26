package Decorator_Pizza_abstract_me;

public abstract class PizzaDecorator extends Pizza {
    protected Pizza pizza;
    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public String getBeschreibung() {
        return pizza.getBeschreibung();
    }

    @Override
    public double getPreis() {
        return pizza.getPreis();
    }

}
