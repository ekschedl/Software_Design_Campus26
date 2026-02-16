package Observer_Podcast_nur_das_neueste_Podcast;

public interface Server_subject {
    void registerGeraet(Geraet_observer geraet);
    void removeGeraet(Geraet_observer geraet);
    void notifyGerate();
}
