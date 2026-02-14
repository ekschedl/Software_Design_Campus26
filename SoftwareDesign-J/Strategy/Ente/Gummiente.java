package Strategy.Ente;

public class Gummiente extends Ente {
    public Gummiente(String name) {
        super(name,null);
    }

    @Override
    public void anzeigen() {
        System.out.println("Gummiente "+name+" quietscht");
    }

}
