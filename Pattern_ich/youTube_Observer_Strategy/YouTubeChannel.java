package youTube_Observer_Strategy;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {
    List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);

    }
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void uploadVideo(Video video) {
        notifySubscribers(video);
    }

    private void notifySubscribers(Video video) {
        for (Subscriber s : subscribers) {
            s.update(video);
        }
    }
}
