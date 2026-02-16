package Strategy.Ente;

public class SegelFlugVerhalten implements Flugverhalten {
    public SegelFlugVerhalten() {

    }

    @Override
    public void fliegen() {
        System.out.println("Duck segelt");
    }
}
