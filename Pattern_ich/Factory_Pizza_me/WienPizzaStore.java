package Ich.Factory_Pizza_me;


public class WienPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String pizzatype) {
        if (pizzatype.equals("mushroom")) {
            return new WienMushroomPizza();
        } else if (pizzatype.equals("veggie")) {
            return new WienVeggiePizza();
        } else {
            return null;
        }
    }
}
