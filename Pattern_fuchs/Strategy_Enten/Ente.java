package Strategy_Enten;

public abstract class Ente {
    protected String name;
    private Flugverhalten flugVerhalten;

    public void quaken() {
        System.out.println("Ente quakt");
    }

    public abstract void anzeigen();

    public Ente(String name, Flugverhalten fV) {
        this.name = name;
        this.flugVerhalten = fV;
    }

    public void performFliegen() {
        if(flugVerhalten != null){
            flugVerhalten.fliegen();
        }
    }
}
