package youTube_Observer_Decorator;

public class MobileSubscriber implements Subscriber_observer {

    private String name;

    public MobileSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Video video) {
        System.out.println(name + " (Mobile) bekommt: " + video.getTitle());
    }

    @Override
    public String getName() {
        return name;
    }
}
