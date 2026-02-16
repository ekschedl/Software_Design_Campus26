package Strategy_Enten;

public class Stockente extends Ente {

    @Override
    public void anzeigen() {
        System.out.println("----Ich bin eine Stockente" +
                " und heiße " + super.name);
    }

    public Stockente(String name) {
        super(name, new Flatterflugverhalten());
    }
}
