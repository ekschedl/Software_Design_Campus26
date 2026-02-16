package Ich.Factory_Pizza_me;



public abstract class PizzaStore{
    protected abstract Pizza createPizza(String pizzatype);

    public Pizza orderPizza(String pizzatype){
        Pizza  pizza = createPizza(pizzatype);
        System.out.println("PizzaStore.orderPizza  " + pizza.getName());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
