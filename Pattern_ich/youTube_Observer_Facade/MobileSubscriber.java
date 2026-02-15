package youTube_Observer_Facade;

public class MobileSubscriber implements Subscriber_observer {

    protected String name;
    public MobileSubscriber(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(Video video) {
        System.out.println(getName() + " MobileSubscriber erhalte: " + video.getTitle());

    }
}
