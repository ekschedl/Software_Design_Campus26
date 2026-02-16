package youTube_Observer_Strategy;

public class MobileSubscriber implements Subscriber {

    protected String name;
    protected YouTubeChannel youtubeChannel;
    private NotificationStrategy strategy;

    //	MobileSubscriber update() → Strategy prüfen

    public MobileSubscriber(String name, YouTubeChannel youtubeChannel,NotificationStrategy  strategy) {
        this.name = name;
        this.youtubeChannel = youtubeChannel;
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
            System.out.println(getName() + " MobileSubscriber erhalte: " + video.getTitle());
        }

    }
}
