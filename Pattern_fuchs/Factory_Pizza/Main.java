package Factory_Pizza;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo beim Pizza Beispiel!");

        // zwei Factories
        PizzaStore gStore = new GrazPizzaStore();
        PizzaStore wStore = new WienPizzaStore();

        Pizza pizza1 = wStore.orderPizza("mushroom");
        System.out.println("-----MAIN: Ich habe eine " + pizza1.getName() + " erhalten.");

        Pizza pizza2 = gStore.orderPizza("mushroom");
        System.out.println("-----MAIN: Ich habe eine " + pizza2.getName() + " erhalten.");
    }
}
