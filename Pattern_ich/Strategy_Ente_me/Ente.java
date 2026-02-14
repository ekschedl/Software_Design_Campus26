package Ich.Strategy_Ente_me;


public abstract class Ente {

    protected String name;
    private FlugVerhalten flugVerhalten;

    public void quaken(){
        System.out.println("Ente abstract  quaken");
    };

    public abstract void anzeigen();

    public Ente(String name, FlugVerhalten flugVerhalten) {
        this.name = name;
        this.flugVerhalten = flugVerhalten;
    }

    @Override
    public String toString() {
        return "Ente{" +
                "name='" + name + '\'' +
                ", flugVerhalten=" + flugVerhalten +
                '}';
    }


    public void performFliegen() {
        if(flugVerhalten != null) {
            this.flugVerhalten = flugVerhalten;
        }
    }

}


