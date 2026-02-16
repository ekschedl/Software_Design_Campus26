package youTube_Observer_Singleton;



import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel_Subject {
    private static YouTubeChannel_Subject instance;
    List<Subscriber_observer> subscribers = new ArrayList<Subscriber_observer>();

    private YouTubeChannel_Subject() {
    }

    public static YouTubeChannel_Subject getInstance() {
        if (instance == null) {
            instance = new YouTubeChannel_Subject();
        }
        return instance;
    }

    public void addSubscriber(Subscriber_observer subscriber) {
        subscribers.add(subscriber);

    }
    public void uploadVideo(Video video) {
        notifySubscribers(video);
    }

    private void notifySubscribers(Video video) {
        for (Subscriber_observer s : subscribers) {
            s.update(video);
        }
    }
}
