package Factory.Pizza;

public abstract class PizzaStore {
    //*********Factory Klasse :   ruft die Unterklasse mit createPizza auf!!!!
    //*******deswegen ist es nicht nur eine abstrakte Klasse (wie Objekt Klasse Pizza!!!!)

    public Pizza orderPizza(String orderType) {

        Pizza pizza = createPizza(orderType);
        System.out.println("**** Pizza erstellen: " + pizza.getName() + " ***");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String item);
}
