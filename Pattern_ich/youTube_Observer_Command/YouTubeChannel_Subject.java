package youTube_Observer_Command;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel_Subject {
    private List<Subscriber_observer> subscribers = new ArrayList<Subscriber_observer>();

    public void addSubscriber(Subscriber_observer subscriber) {
        subscribers.add(subscriber);

    }
    public void uploadVideo(Video video) {
        notifySubscribers(video);
    }

    private void notifySubscribers(Video video) {
        for (Subscriber_observer subscriber : subscribers) {
            NotificationCommand cmd =
                    new NotifySubscriberCommand(subscriber, video);

            cmd.execute();
        }
    }
}
/*
✔ Channel erstellt Command
✔ Channel führt Command aus
✔ Channel ruft NICHT direkt subscriber.update()


Observer regelt:
👉 Wer wird informiert?

Command regelt:
👉 Wie wird Aktion gekapselt?

 */