package Factory_Pizza;
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String pizzatype);

    public Pizza orderPizza(String pizzatype) {
        Pizza pizza = createPizza(pizzatype);
        System.out.println("---PizzaStore.createPizza(): " + pizza.getName());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        //pizza.deliver();
        return pizza;
    }
}
