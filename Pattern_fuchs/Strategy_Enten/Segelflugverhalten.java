package Strategy_Enten;

public class Segelflugverhalten implements Flugverhalten{

    @Override
    public void fliegen() {
        System.out.println("Segelt ruhig durch die Luft");
    }
}
