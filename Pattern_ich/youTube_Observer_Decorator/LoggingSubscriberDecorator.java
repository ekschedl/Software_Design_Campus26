package youTube_Observer_Decorator;

public class LoggingSubscriberDecorator
        extends SubscriberDecorator {

    public LoggingSubscriberDecorator(Subscriber_observer subscriber) {
        super(subscriber);
    }

    @Override
    public void update(Video video) {

        System.out.println("LOG: Subscriber wird benachrichtigt");

        super.update(video);
    }
}
