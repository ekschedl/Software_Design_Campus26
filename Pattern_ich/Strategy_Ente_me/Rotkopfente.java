package Ich.Strategy_Ente_me;


public class Rotkopfente extends Ente {

    @Override
    public void anzeigen() {
        System.out.println("----Ich bin eine Rotkopfente"+
                " und heiße " + super.name);
    }

    public Rotkopfente(String name) {
        super(name, new Segelflugverhalten()); //soll segeln
    }
}