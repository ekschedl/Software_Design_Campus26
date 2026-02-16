package Template_CaffeineBeverage;


public class Main {
    public static void main(String[] args) {

        Tea t = new Tea();
        t.prepareRecipe();
        System.out.println("---");
        PumpkinSpiceLatte l = new PumpkinSpiceLatte();
        l.prepareRecipe();
        System.out.println("---");
        Coffee c = new Coffee();
        c.prepareRecipe();


    }
}