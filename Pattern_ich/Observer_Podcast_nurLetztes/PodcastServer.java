package Observer_Podcast_nurLetztes;

import Observer_Podcast_nur_das_neueste_Podcast.Geraet_observer;
import Observer_Podcast_nur_das_neueste_Podcast.Podcast;
import Observer_Podcast_nur_das_neueste_Podcast.Server_subject;

import java.util.ArrayList;
import java.util.List;

//Subject
public class PodcastServer  implements Server_subject {
    private List<Observer_Podcast_nur_das_neueste_Podcast.Geraet_observer> geraete= new ArrayList<>();;
    private Observer_Podcast_nur_das_neueste_Podcast.Podcast latestPodcast;

    @Override
    public void registerGeraet(Observer_Podcast_nur_das_neueste_Podcast.Geraet_observer geraet) {
        geraete.add(geraet);
    }

    @Override
    public void removeGeraet(Observer_Podcast_nur_das_neueste_Podcast.Geraet_observer geraet) {
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

