package Strategy.Ente;

public class Rotkopfente extends Ente {


    public Rotkopfente(String name) {
        super(name,new SegelFlugVerhalten());
    }

    @Override
    public void anzeigen() {
        System.out.println("Rotkopfente "+name+" ärgert sich und bekommt einen roten Kopf.");
    }
}
