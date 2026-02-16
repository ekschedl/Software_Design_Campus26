package Factory_Pizza;
public class GrazPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String pizzatype) {
        if(pizzatype.equals("mushroom")){
            return new GrazMushroomPizza();
        }else if(pizzatype.equals("veggie")){
            return new GrazVeggiePizza();
        }
        return null;
    }
}
