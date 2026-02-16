package Factory.Pizza;

public class WienPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("mushroom")){
            return new WienMushroomPizza();
        }else if(item.equals("veggie")){
           return new WienVeggiePizza();
        }

        return null;
    }
}
