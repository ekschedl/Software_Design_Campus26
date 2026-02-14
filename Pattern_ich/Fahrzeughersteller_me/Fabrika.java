package Fahrzeughersteller_me;



public  abstract class Fabrika {
    protected abstract Auto produziereAuto(String autotype);

    public Auto bestelleAuto(AutoType autotype){

       Auto a = produziereAuto(String.valueOf(autotype));

        if (a == null){
            System.out.println("Gibts hier nicht");
            return null;
        }

        a.hupe();
        a.wasche();

        return a;
    }
}
