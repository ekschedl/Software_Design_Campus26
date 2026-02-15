package youTube_Observer_Command;

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
        System.out.println("**********************");
        myChannel.uploadVideo(video);
        System.out.println("**********************");

        myChannel.uploadVideo(video2);
        System.out.println("**********************");

        myChannel.uploadVideo(new Video("Gaming", "Level 1"));
        System.out.println("**********************");

        myChannel.uploadVideo(new Video("Vlog", "Daily vlog"));

    }
}
/*
	•	Channel wird erstellt
	•	Subscriber registrieren sich im Konstruktor
	•	uploadVideo() wird aufgerufen
	•	Channel erzeugt Commands
	•	Commands führen update() aus

→ Observer + Command laufen korrekt.
 */