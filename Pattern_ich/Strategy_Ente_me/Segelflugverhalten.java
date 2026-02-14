package Ich.Strategy_Ente_me;


public class Segelflugverhalten implements FlugVerhalten {
    @Override
    public void fliegen() {
        System.out.println("Segelflugverhalten");
    }
}
