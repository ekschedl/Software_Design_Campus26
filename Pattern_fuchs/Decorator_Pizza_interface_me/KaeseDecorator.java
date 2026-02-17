package Decorator_Pizza_interface_me;

public class KaeseDecorator extends PizzaDecorator{
    public KaeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPreis() {
        return super.getPreis() + 1.00;
    }

    @Override
    public String getBeschreibung() {
        return super.getBeschreibung() +" mit Käse";
    }


}
