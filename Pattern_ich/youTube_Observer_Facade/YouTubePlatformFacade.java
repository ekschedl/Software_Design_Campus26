package youTube_Observer_Facade;

public class YouTubePlatformFacade {

    private YouTubeChannel_Subject channel;

    public YouTubePlatformFacade() {
        this.channel = new YouTubeChannel_Subject();
    }

    public void registerEmailSubscriber(String name) {

        EmailSubscriber subscriber =
                new EmailSubscriber(name);

        channel.addSubscriber(subscriber);
    }


    public void registerMobileSubscriber(String name) {

        MobileSubscriber subscriber =
                new MobileSubscriber(name);

        channel.addSubscriber(subscriber);
    }

    public void uploadVideo(String title, String description) {

        Video video = new Video(title, description);

        channel.notifySubscribers(video);
    }
}