package Ich.Factory_Pizza_me;

public class GrazPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String pizzatype) {
        if (pizzatype.equals("mushroom")) {
            return new GrazMushroomPizza();
        } else if (pizzatype.equals("veggie")) {
                return new GrazVeggiePizza();
        } else {
            return null;
        }
    }
}
