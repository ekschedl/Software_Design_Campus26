package youTube_Observer_Facade;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel_Subject {
    List<Subscriber_observer> subscribers = new ArrayList<Subscriber_observer>();

    public void addSubscriber(Subscriber_observer subscriber) {
        subscribers.add(subscriber);

    }
    public void removeSubscriber(Subscriber_observer subscriber) {
        subscribers.remove(subscriber);
    }
//notify/publish/uploadVideo
    public void notifySubscribers(Video video) {
        for (Subscriber_observer subscriber : subscribers) {
            subscriber.update(video);
        }
    }
}
