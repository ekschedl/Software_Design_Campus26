package Ich.Strategy_Ente_me;


public class StockEnte extends Ente {

    public StockEnte(String name) {
        super(name, new Flatterflugverhalten());
    }

    @Override
    public void anzeigen() {
        System.out.println("ich bin Stockente, getName: " + ", super.name:" + super.name);
    }
}
