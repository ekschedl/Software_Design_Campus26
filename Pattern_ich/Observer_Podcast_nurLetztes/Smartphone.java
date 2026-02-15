package Observer_Podcast_nurLetztes;

import Observer_Podcast_nur_das_neueste_Podcast.Geraet_observer;
import Observer_Podcast_nur_das_neueste_Podcast.Podcast;
import Observer_Podcast_nur_das_neueste_Podcast.Server_subject;

public class Smartphone  implements Geraet_observer {

    public Observer_Podcast_nur_das_neueste_Podcast.Server_subject server_subject;

    // registriert sich selbst beim Server.
    public Smartphone(Server_subject server_subject) {
        this.server_subject = server_subject;
        server_subject.registerGeraet(this);
    }
    @Override
    public void update(Podcast p) {
        System.out.println("auf Smartphone kommt: name " + p.getName() + ",  url " + p.getUrl() + ", dauer " + p.getDauer());
    }
}
