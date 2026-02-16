package Factory.Pizza;

public class Main {
    public static void main(String[] args) {

        PizzaStore gstore = new GrazPizzaStore();
        PizzaStore wstore = new WienPizzaStore();

        Pizza pizza1 = gstore.orderPizza("mushroom");
        System.out.println("Main: Ich bestellte eine "+pizza1.getName());
        Pizza pizza2 = wstore.orderPizza("veggie");
        System.out.println("Main: Ich bestellte eine "+pizza2.getName());
    }
}
