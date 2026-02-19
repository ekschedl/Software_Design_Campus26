package Observer_Podcast_nurLetztes;

import Observer_Podcast_nur_das_neueste_Podcast_2i.Notebook;
import Observer_Podcast_nur_das_neueste_Podcast_2i.Podcast;
import Observer_Podcast_nur_das_neueste_Podcast_2i.PodcastServer;
import Observer_Podcast_nur_das_neueste_Podcast_2i.Smartphone;
import Observer_Podcast_nur_das_neueste_Podcast_2i.Smartwatch;

public class Main {
    public static void main(String[] args) {
        Observer_Podcast_nur_das_neueste_Podcast_2i.PodcastServer podcast_server = new PodcastServer();

        // Observer registrieren sich automatisch
        Observer_Podcast_nur_das_neueste_Podcast_2i.Smartwatch smartwatch = new Smartwatch(podcast_server);
        Observer_Podcast_nur_das_neueste_Podcast_2i.Smartphone smartphone = new Smartphone(podcast_server);
        Observer_Podcast_nur_das_neueste_Podcast_2i.Notebook notebook = new Notebook(podcast_server);

        // Neues Podcast veröffentlichen
        Observer_Podcast_nur_das_neueste_Podcast_2i.Podcast podcast1=new Podcast("Observer Pattern erklärt","www.podcast.at/folge1",
                42.5);

        podcast_server.addPodcast(podcast1);

    }
}
