package Template.TemplatePattern;
//wichtig die einzelnen Klassen leiten sich von CaffeinBeverage ab
public class IceCoffee extends CaffeineBeverage{

    @Override
    protected void brew() {
        System.out.println("Ice Coffee in Fridge");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add Condiments: little bit of sugar");
    }

    @Override
    protected void boilWater() {
        super.boilWater();
        System.out.println("Cool water to 5C");
    }

    @Override
    protected void pourInCup() {
        super.pourInCup();
    }
}
