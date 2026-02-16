package Template_CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
    @Override
    protected void boilWater() {
        System.out.println("Boil water with 93 degree C");
    }

    @Override
    protected void brew() {
        System.out.println("Make a nice pour over");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Nothing");
    }
}
