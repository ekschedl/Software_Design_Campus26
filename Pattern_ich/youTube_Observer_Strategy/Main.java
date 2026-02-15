package youTube_Observer_Strategy;

public class Main {
    public static void main(String[] args) {

        YouTubeChannel myChannel = new YouTubeChannel();
        NotificationStrategy gstrategy=new GamingStrategy();
        EmailSubscriber emailSubscriber1=new EmailSubscriber(myChannel, "Ekaterina",gstrategy);
        EmailSubscriber emailSubscriber2=new EmailSubscriber(myChannel, "Peter", null);
        EmailSubscriber emailSubscriber3=new EmailSubscriber(myChannel, "Max",gstrategy);
        MobileSubscriber mobileSubscriber1=new MobileSubscriber( "Alex", myChannel,gstrategy);
        MobileSubscriber mobileSubscriber2=new MobileSubscriber( "Manfred", myChannel,gstrategy);
        MobileSubscriber mobileSubscriber3=new MobileSubscriber( "Fritz", myChannel, null);

        Video docvideo=new Video("Doc", "new Documentation");
        Video gvideo=new Video("Gaming", "schaue dir es an");
        Video g2video=new Video("new Gaming", "schaue dir es an");
        myChannel.uploadVideo(gvideo);
        myChannel.uploadVideo(docvideo);
        myChannel.uploadVideo(g2video);

    }
}
