package Factory_Pizza;
public class WienPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String pizzatype) {
        if (pizzatype.equals("mushroom")) {
            return new WienMushroomPizza();
        } else if (pizzatype.equals("veggie")) {
            return new WienVeggiePizza();
        }
        return null;
    }
}
