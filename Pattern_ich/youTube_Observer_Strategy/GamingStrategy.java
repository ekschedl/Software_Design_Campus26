package youTube_Observer_Strategy;

public class GamingStrategy implements NotificationStrategy {
    @Override
    public boolean shouldNotify(Video video) {
        return video.getTitle().contains("Gaming");
    }
}
