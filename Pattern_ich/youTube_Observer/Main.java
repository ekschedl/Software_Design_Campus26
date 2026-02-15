package youTube_Observer;

public class Main {
    public static void main(String[] args) {

        YouTubeChannel_Subject myChannel = new YouTubeChannel_Subject();
        EmailSubscriber emailSubscriber1=new EmailSubscriber(myChannel, "Ekaterina");
        EmailSubscriber emailSubscriber2=new EmailSubscriber(myChannel, "Peter");
        EmailSubscriber emailSubscriber3=new EmailSubscriber(myChannel, "Max");
        MobileSubscriber mobileSubscriber1=new MobileSubscriber( "Alex", myChannel);
        MobileSubscriber mobileSubscriber2=new MobileSubscriber( "Manfred", myChannel);
        MobileSubscriber mobileSubscriber3=new MobileSubscriber( "Fritz", myChannel);

        Video video=new Video("New video", "schaue dir es an");
        Video video2=new Video("New video2", "schaue dir es an");
        myChannel.notifySubscribers(video);
        myChannel.notifySubscribers(video2);

    }
}
