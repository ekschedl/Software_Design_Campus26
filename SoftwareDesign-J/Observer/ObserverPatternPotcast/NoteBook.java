package Observer.ObserverPatternPotcast;

public class NoteBook implements PotcastPlayer {
    private  String name;
    private PodcastServer podcastServer;

    public NoteBook(String name, PodcastServer podcastServer) {
        this.name = name;
        System.out.println("NoteBook created"+name);
        this.podcastServer = podcastServer;
        podcastServer.addSubscriber(this);
    }

    @Override
    public void erhalte(Potcast potcast) {
        System.out.println("NoteBook "+ name + " bekommt einen neuen Potcast: "+ potcast.getName()+", "+potcast.getUrl()+", "+potcast.getLengthInMinutes()+" Minuten lang");
    }

    @Override
    public String getName() {
        return name;
    }
}
