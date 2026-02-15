package youTube_Observer_Decorator;

public class Main {

    public static void main(String[] args) {

        YouTubeChannel_Subject channel =
                new YouTubeChannel_Subject();

        Subscriber_observer mobile =
                new MobileSubscriber("Max");

        Subscriber_observer premiumMobile =
                new PremiumSubscriberDecorator(mobile);

        Subscriber_observer loggingPremium =
                new LoggingSubscriberDecorator(premiumMobile);

        channel.addSubscriber(loggingPremium);

        channel.uploadVideo(
                new Video("Gaming", "Neues Gaming Video"));
    }
}
