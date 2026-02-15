package youTube_Observer_Strategy;

public interface NotificationStrategy {
    boolean shouldNotify(Video video);
}
