package Strategy.Ente;

public class WatschelFlugVerhalten implements Flugverhalten {
    public WatschelFlugVerhalten() {
        System.out.println("Duck watschelt");
    }

    @Override
    public void fliegen() {
        System.out.println("Duck watschelt");

    }
}
