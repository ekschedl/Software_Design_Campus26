package Strategy.Ente;

public abstract class Ente {
    protected String name;

    private Flugverhalten flugVerhalten;

    public Ente(String name, Flugverhalten flugVerhalten) {
        this.name = name;
        this.flugVerhalten=flugVerhalten;
    }

    public void quaken() {
        System.out.println("Duck "+name+" quakt");
    }

    public void schwimmen() {
        System.out.println("Duck "+name+" schwimmt");
    }

    public abstract void anzeigen();

    public void performFliegen(){
      if(flugVerhalten!=null){
          flugVerhalten.fliegen();
      }else{
          System.out.println("Flugverhalten = null");
      }
    }
}
