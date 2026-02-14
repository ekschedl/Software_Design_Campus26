package Template.TemplatePattern;

public class Main {
    public static void main(String[] args) {

        ChaiTea chaiTea = new ChaiTea();
        chaiTea.prepareRecipe();

        System.out.println("****************");

        IceCoffee iceCoffee = new IceCoffee();
        iceCoffee.prepareRecipe();
    }
}
