package youTube_Observer_Iterator;

public class Main {
    public static void main(String[] args) {

        YouTubeChannel_Subject myChannel = new YouTubeChannel_Subject();
        EmailSubscriber emailSubscriber1=new EmailSubscriber("Ekaterina");
        EmailSubscriber emailSubscriber2=new EmailSubscriber("Peter");
        EmailSubscriber emailSubscriber3=new EmailSubscriber( "Max");
        MobileSubscriber mobileSubscriber1=new MobileSubscriber( "Alex");
        MobileSubscriber mobileSubscriber2=new MobileSubscriber( "Manfred");
        MobileSubscriber mobileSubscriber3=new MobileSubscriber( "Fritz");
        myChannel.addSubscriber(emailSubscriber1);
        myChannel.addSubscriber(emailSubscriber2);
        myChannel.addSubscriber(emailSubscriber3);
        myChannel.addSubscriber(mobileSubscriber1);
        myChannel.addSubscriber(mobileSubscriber2);
        myChannel.addSubscriber(mobileSubscriber3);

        Video video=new Video("New video", "schaue dir es an");
        Video video2=new Video("New video2", "schaue dir es an");
        myChannel.uploadVideo(video);
        myChannel.uploadVideo(video2);

        SubscriberIterator it = myChannel.createIterator();
        while(it.hasNext()) {
            Subscriber_observer s = it.next();
            System.out.println(s.getName());
        }
    }
}

