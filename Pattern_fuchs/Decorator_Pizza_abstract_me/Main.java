package Decorator_Pizza_abstract_me;

public class Main {
    public static void main(String[] args) {

        Pizza basicPizza = new BasicPizza();
        System.out.println(basicPizza.getBeschreibung() + "kostet: " + basicPizza.getPreis());

        System.out.println("******************************");
        basicPizza =new KaeseDecorator(basicPizza);
        System.out.println("Beschreibung: " + basicPizza.getBeschreibung());
        System.out.println("Kosten: " + basicPizza.getPreis());

        System.out.println("******************************");
        basicPizza= new OlivenDecorator(basicPizza);
        System.out.println("Beschreibung: " + basicPizza.getBeschreibung());
        System.out.println("Kosten: " + basicPizza.getPreis());

        System.out.println("******************************");
        Pizza margherita = new Margherita();
        margherita=new OlivenDecorator(margherita);
        System.out.println("Beschreibung: " + margherita.getBeschreibung());
        System.out.println("Kosten: " + margherita.getPreis());
    }
}
