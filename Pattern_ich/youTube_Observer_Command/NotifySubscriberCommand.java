package youTube_Observer_Command;

public class NotifySubscriberCommand  implements NotificationCommand{
    private Subscriber_observer subscriber;
    private Video video;

    public NotifySubscriberCommand(Subscriber_observer subscriber, Video video) {
        this.subscriber = subscriber;
        this.video = video;
    }

    @Override
    public void execute() {
        subscriber.update(video);
    }
}
