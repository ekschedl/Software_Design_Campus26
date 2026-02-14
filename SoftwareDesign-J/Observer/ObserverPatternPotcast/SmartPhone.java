package Observer.ObserverPatternPotcast;

public class SmartPhone implements PotcastPlayer {
    private  String name;
    private PodcastServer podcastServer;

    public SmartPhone(String name, PodcastServer podcastServer) {
        this.name = name;
        System.out.println("SMSAbonnent created"+name);
        this.podcastServer = podcastServer;
        podcastServer.addSubscriber(this);
    }

    @Override
    public void erhalte(Potcast potcast) {
        System.out.println("SmartPhone "+ name + " bekommt einen neuen Potcast: "+ potcast.getName()+", "+potcast.getUrl()+", "+potcast.getLengthInMinutes()+" Minuten lang");
    }

    @Override
    public String getName() {
        return name;
    }
}
