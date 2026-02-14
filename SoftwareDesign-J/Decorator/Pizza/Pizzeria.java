package Decorator.Pizza;

public class Pizzeria {
    public static void main(String[] args) {

        System.out.println("Pizzeria");

        Pizza magherita = new Magherita();

        magherita=new Kaese(magherita);
        magherita=new Oliven(magherita);
        magherita=new Paprika(magherita);
        System.out.println("Beschreibung: "+magherita.getBeschreibung());
        System.out.println("Gesamtkosten: "+magherita.kostet()+" Euro");

        Pizza salami = new Salami();

        salami=new Schinken(salami);
        salami=new Kaese(salami);

        System.out.println("Beschreibung: "+salami.getBeschreibung());
        System.out.println("Gesamtkosten: "+salami.kostet()+" Euro");

    }
}
