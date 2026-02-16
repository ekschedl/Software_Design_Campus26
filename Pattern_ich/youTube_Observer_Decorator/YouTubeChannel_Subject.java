package youTube_Observer_Decorator;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel_Subject {
    private List<Subscriber_observer> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber_observer subscriber) {
        subscribers.add(subscriber);
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
