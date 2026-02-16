package Ich.Strategy_Ente_me;

public class Flatterflugverhalten implements FlugVerhalten {
    @Override
    public void fliegen() {
        System.out.println("Flatterflugverhalten");
    }
}
