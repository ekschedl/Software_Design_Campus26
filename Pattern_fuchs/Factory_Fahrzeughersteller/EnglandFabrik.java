package Factory_Fahrzeughersteller;


public class EnglandFabrik extends Fabrik{

    @Override
    public Auto produziereAuto(AutoTyp typ){

        if (typ == AutoTyp.MonsterTruck)
            return new MonsterTruck();

        else if (typ == AutoTyp.LKW)
            return new LKW();

        return null;
    }
}
