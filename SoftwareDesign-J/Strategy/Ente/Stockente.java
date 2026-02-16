package Strategy.Ente;

public class Stockente extends Ente {

    public Stockente(String name) {
        super(name,new FlatterflugVerhalten());
    }

    @Override
    public void anzeigen() {
        System.out.println("Stockente "+name+" stolpert übr den Stock.");
    }
}
