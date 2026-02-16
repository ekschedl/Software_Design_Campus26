package Template_CaffeineBeverage;

public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Brew loose black leaf tea for 7 min");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add Milk");
    }
}
