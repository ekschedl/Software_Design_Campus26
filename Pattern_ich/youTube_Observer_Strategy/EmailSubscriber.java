package youTube_Observer_Strategy;
//	EmailSubscriber update() → Strategy prüfen
public class EmailSubscriber implements Subscriber {
    protected String name;
    protected YouTubeChannel youtubeChannel;
    private NotificationStrategy strategy;
    public EmailSubscriber(YouTubeChannel youtubeChannel, String name,NotificationStrategy strategy) {
        this.youtubeChannel = youtubeChannel;
        this.name = name;
        this.strategy = strategy;
        youtubeChannel.addSubscriber(this);
    }

    public NotificationStrategy getStrategy() {
        return strategy;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(Video video) {
        if (strategy == null || strategy.shouldNotify(video)) {
            System.out.println(getName() + " EmailSubscriber erhalte: " + video.getTitle());
        }
    }
}
