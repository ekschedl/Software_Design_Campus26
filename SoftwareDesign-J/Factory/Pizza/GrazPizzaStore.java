package Factory.Pizza;

public class GrazPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("mushroom")){
            return new GrazMushroomPizza();
        }else if(item.equals("veggie")){
           return new GrazVeggiePizza();
        }

        return null;
    }
}
