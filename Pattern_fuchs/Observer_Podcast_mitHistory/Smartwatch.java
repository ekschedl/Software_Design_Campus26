package Observer_Podcast_mitHistory;
public class Smartwatch
        implements Observer {

    public Subject pS;

    public Smartwatch(Subject pS)
    {
        this.pS = pS;
        pS.registerObserver(this);
    }

    @Override
    public void update(Podcast p) {
        System.out.println("Smartwatch plays " + p.getName());

    }

}
