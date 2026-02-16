package Observer_Podcast_mitHistory;
public class Smartphone
        implements Observer {

    public Subject pS;

    public Smartphone(Subject pS)
    {
        this.pS = pS;
        pS.registerObserver(this);
    }

    @Override
    public void update(Podcast p) {
        System.out.println("Smartphone plays " + p.getName());

    }

}
