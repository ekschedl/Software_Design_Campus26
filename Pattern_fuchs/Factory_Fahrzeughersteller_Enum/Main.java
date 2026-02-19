package Factory_Fahrzeughersteller_Enum;

class Main {
    public static void main(String[] args) {

        Fabrik fDeutschland = new DeutschlandFabrik();
        Auto a = fDeutschland.bestelleAuto(AutoTyp.Fiat);

        System.out.println();
        a = fDeutschland.bestelleAuto(AutoTyp.Ferrari);

        System.out.println();
        a = fDeutschland.bestelleAuto(AutoTyp.MonsterTruck);

        System.out.println("----");

        Fabrik fEngland = new EnglandFabrik();
        a = fEngland.bestelleAuto(AutoTyp.MonsterTruck);

        System.out.println();
        a = fEngland.bestelleAuto(AutoTyp.LKW);

        System.out.println();
        a = fEngland.bestelleAuto(AutoTyp.Fiat);
    }
}