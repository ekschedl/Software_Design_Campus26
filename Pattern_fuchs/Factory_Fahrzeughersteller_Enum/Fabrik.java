package Factory_Fahrzeughersteller_Enum;

public abstract class Fabrik {
    public Auto bestelleAuto(AutoTyp type){

        Auto a = produziereAuto(type);

        if (a == null){
            System.out.println("Gibts hier nicht");
            return null;
        }

        a.hupe();
        a.wasche();

        return a;
    }

    public abstract Auto produziereAuto(AutoTyp type);
}
