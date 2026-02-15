package youTube_Observer_Iterator;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel_Subject {
    private List<Subscriber_observer> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber_observer subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber_observer subscriber) {
        subscribers.remove(subscriber);
    }

    public SubscriberIterator createIterator() {
        return new ChannelSubscriberIterator(subscribers);
    }

    public void uploadVideo(Video video) {
        notifySubscribers(video);
    }

    private void notifySubscribers(Video video) {
        for (Subscriber_observer subscriber : subscribers) {
            subscriber.update(video);
        }
    }
}
