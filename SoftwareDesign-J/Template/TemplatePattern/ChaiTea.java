package Template.TemplatePattern;

public class ChaiTea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Chai Tea: brew with a little bit of water");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Chai Tea: adding milk and honey");
    }

    @Override
    protected void boilWater() {
        super.boilWater();
    }

    @Override
    protected void pourInCup() {
        super.pourInCup();
    }
}
