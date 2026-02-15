package youTube_Observer_Singleton;

public class MobileSubscriber implements Subscriber_observer {

    protected String name;
    protected YouTubeChannel_Subject youtubeChannel;
    public MobileSubscriber(String name, YouTubeChannel_Subject youtubeChannel) {
        this.name = name;
        this.youtubeChannel = youtubeChannel;
        youtubeChannel.addSubscriber(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(Video video) {
        System.out.println(getName() + " MobileSubscriber erhalte: " + video.getTitle());

    }
}
