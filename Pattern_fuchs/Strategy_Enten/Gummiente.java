package Strategy_Enten;

public class Gummiente extends Ente{

    @Override
    public void anzeigen() {
        System.out.println("----Ich bin eine Gummiente"+
                " und heiße " + super.name);
    }

    public Gummiente(String name) {
        super(name, null);
    }
}
