package Template_CaffeineBeverage;

public abstract class CaffeineBeverage {

    // algorithm skeleton - template method - can't be overwritten
    final void prepareRecipe(){
        // steps of algorithm
        boilWater();
        brew();
        pourInCup();
        addCondiments();

    }
    protected void boilWater(){
        System.out.println("Cook water with 100 degree C");
    }
    protected void pourInCup(){
        System.out.println("Pour into favourite Hansi mug");
    }
    protected abstract void brew();
    protected abstract void addCondiments();
}
