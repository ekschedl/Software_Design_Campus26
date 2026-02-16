package Observer_Podcast_nur_das_neueste_Podcast;

import java.util.ArrayList;
import java.util.List;

/*
	•	Server speichert nur das neueste Podcast
	•	Beim Hinzufügen wird sofort benachrichtigt
	•	Observer bekommt direkt das neue Objekt
 */
public class PodcastServer  implements  Server_subject{
    private List<Geraet_observer> geraete= new ArrayList<>();;
    private Podcast latestPodcast;

    @Override
    public void registerGeraet(Geraet_observer geraet) {
        geraete.add(geraet);
    }

    @Override
    public void removeGeraet(Geraet_observer geraet) {
        geraete.remove(geraet);
    }

    @Override
    public void notifyGerate() {
         for (Geraet_observer geraet : geraete) {
             geraet.update(latestPodcast);
         }
    }

    public void addPodcast (Podcast podcast) {
        this.latestPodcast = podcast;
        notifyGerate();
    }
}

