package Decorator_Pizza_interface_me;

public abstract class PizzaDecorator implements Pizza{
    private Pizza pizza;
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
