package youTube_Observer_Decorator;

public class PremiumSubscriberDecorator extends SubscriberDecorator {

    public PremiumSubscriberDecorator(Subscriber_observer subscriber) {
        super(subscriber);
    }

    @Override
    public void update(Video video) {

        System.out.println("Premium Feature aktiviert");

        super.update(video);
    }
}
