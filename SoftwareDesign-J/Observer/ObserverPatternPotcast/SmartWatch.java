package Observer.ObserverPatternPotcast;

public class SmartWatch implements PotcastPlayer {
    private  String name;
    private PodcastServer podcastServer;

    public SmartWatch(String name, PodcastServer podcastServer) {
        this.name = name;
        System.out.println("SmartWatch created"+name);
        this.podcastServer = podcastServer;
        podcastServer.addSubscriber(this);
    }

    @Override
    public void erhalte(Potcast potcast) {
        System.out.println("'SmartWatch' "+ name + " bekommt einen neuen Potcast: "+ potcast.getName()+", "+potcast.getUrl()+", "+potcast.getLengthInMinutes()+" Minuten lang");
    }

    @Override
    public String getName() {
        return name;
    }
}
