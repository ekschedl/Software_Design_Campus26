package youTube_Observer_Facade;

public class EmailSubscriber implements Subscriber_observer {
    protected String name;
    public EmailSubscriber(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(Video video) {
        System.out.println(name + " " +
                "bekommt: " + video.getTitle());
    }
}
