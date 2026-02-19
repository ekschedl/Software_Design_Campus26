package Observer_Podcast_nurLetztes;

import Observer_Podcast_nur_das_neueste_Podcast_2i.Geraet_observer;

public interface Server_subject {
    void registerGeraet(Observer_Podcast_nur_das_neueste_Podcast_2i.Geraet_observer geraet);
    void removeGeraet(Geraet_observer geraet);
    void notifyGerate();
}
