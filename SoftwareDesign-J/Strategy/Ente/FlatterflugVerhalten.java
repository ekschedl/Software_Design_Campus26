package Strategy.Ente;

public class FlatterflugVerhalten implements Flugverhalten {
    public FlatterflugVerhalten() {
        System.out.println("Duck seglet");
    }

    @Override
    public void fliegen() {
        System.out.println("Duck seglet");

    }
}
