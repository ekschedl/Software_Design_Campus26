package youTube_Observer_Singleton;

public class Main {
    public static void main(String[] args) {

        //Egal wie oft du getInstance() aufrufst —
        //es wird immer dieselbe Instanz zurückgegeben.
        //also Beide Variablen myChannel  und myChannel2 zeigen auf dieselbe Instanz.
        YouTubeChannel_Subject myChannel =
                YouTubeChannel_Subject.getInstance();
        YouTubeChannel_Subject myChannel2 =
                YouTubeChannel_Subject.getInstance();
        System.out.println(myChannel==myChannel2); //true
        EmailSubscriber emailSubscriber1=new EmailSubscriber(myChannel, "Ekaterina");
        EmailSubscriber emailSubscriber2=new EmailSubscriber(myChannel, "Peter");
        EmailSubscriber emailSubscriber3=new EmailSubscriber(myChannel, "Max");
        MobileSubscriber mobileSubscriber1=new MobileSubscriber( "Alex", myChannel);
        MobileSubscriber mobileSubscriber2=new MobileSubscriber( "Manfred", myChannel);
        MobileSubscriber mobileSubscriber3=new MobileSubscriber( "Fritz", myChannel);

        Video video=new Video("New video", "schaue dir es an");
        Video video2=new Video("New video2", "schaue dir es an");
        myChannel2.uploadVideo(video);
        myChannel.uploadVideo(video2);

    }
}
