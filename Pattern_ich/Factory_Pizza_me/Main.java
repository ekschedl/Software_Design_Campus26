package Ich.Factory_Pizza_me;



public class Main {
    public static void main(String[] args) {

        System.out.println("Hallo beim Katja Pizza ");

        PizzaStore gStore = new GrazPizzaStore();
        PizzaStore wStore= new WienPizzaStore();

        Pizza pizza1=gStore.orderPizza("mushroom");
        System.out.println("-----MAIN: Ich habe eine " + pizza1.getName() + " erhalten.");

        Pizza pizza2=wStore.orderPizza("veggie");
        System.out.println("-----MAIN: Ich habe eine " + pizza2.getName() + " erhalten.");

    }
}
