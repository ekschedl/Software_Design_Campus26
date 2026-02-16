package youTube_Observer_Iterator;

public class EmailSubscriber implements Subscriber_observer {
    protected String name;
    public EmailSubscriber( String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(Video video) {

        System.out.println(getName() + " EmailSubscriber erhalte: " + video.getTitle());

    }
}
