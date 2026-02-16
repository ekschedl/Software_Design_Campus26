package youTube_Observer;

public class EmailSubscriber implements Subscriber_observer {
    protected String name;
    protected YouTubeChannel_Subject youtubeChannel;
    public EmailSubscriber(YouTubeChannel_Subject youtubeChannel, String name) {
        this.youtubeChannel = youtubeChannel;
        this.name = name;
        youtubeChannel.addSubscriber(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(Video video) {

        System.out.println(getName() + " EmailSubscriber erhalte: " + video.getTitle());

    }
}
