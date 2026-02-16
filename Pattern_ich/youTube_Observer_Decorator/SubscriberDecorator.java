package youTube_Observer_Decorator;

public abstract class SubscriberDecorator implements Subscriber_observer{

    protected Subscriber_observer subscriber;

    public SubscriberDecorator(Subscriber_observer subscriber) {
        this.subscriber = subscriber;
    }

    @Override
    public void update(Video video) {
        subscriber.update(video);
    }

    @Override
    public String getName() {
        return subscriber.getName();
    }
}
