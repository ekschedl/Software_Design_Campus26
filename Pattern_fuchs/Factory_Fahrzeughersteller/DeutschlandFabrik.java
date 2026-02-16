package Factory_Fahrzeughersteller;


public class DeutschlandFabrik extends Fabrik{

    @Override
    public Auto produziereAuto(AutoTyp typ){

        if (typ == AutoTyp.Fiat)
            return new Fiat();

        else if (typ == AutoTyp.Ferrari)
            return new Ferrari();

        return null;
    }
}
