package Ich.Strategy_Ente_me;

public class GummiEnte extends Ente {

    public GummiEnte(String name) {
        super(name, null);
    }

    @Override
    public void anzeigen() {
        System.out.println("ich bin GummiEnte,  "  + ", super.name:" + super.name);
    }
}

