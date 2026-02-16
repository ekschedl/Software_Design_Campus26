package Factory.AutoFabrik;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fabrik startet");

        FabrikDeutschland deutschland = new FabrikDeutschland();
        FabrikEngland england = new FabrikEngland();

        AutoTyp auto1 =deutschland.orderCar("Pkw");

        System.out.println("Ich bestellte einen Pkw in Deutschland ");
        // hier ist die Schnittstelle: orderCar!!!!
        AutoTyp auto2 =england.orderCar("Pkw");

        System.out.println("Ich bestellte keinen Pkw in England ");

        AutoTyp auto3 =england.orderCar("Lkw");

        System.out.println("Ich bestellte einen Lkw in England ");
    }
}
