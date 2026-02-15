package Observer_Podcast_nurLetztes;

import Observer_Podcast_nur_das_neueste_Podcast.Notebook;
import Observer_Podcast_nur_das_neueste_Podcast.Podcast;
import Observer_Podcast_nur_das_neueste_Podcast.PodcastServer;
import Observer_Podcast_nur_das_neueste_Podcast.Smartphone;
import Observer_Podcast_nur_das_neueste_Podcast.Smartwatch;

public class Main {
    public static void main(String[] args) {
        Observer_Podcast_nur_das_neueste_Podcast.PodcastServer podcast_server = new PodcastServer();

        // Observer registrieren sich automatisch
        Observer_Podcast_nur_das_neueste_Podcast.Smartwatch smartwatch = new Smartwatch(podcast_server);
        Observer_Podcast_nur_das_neueste_Podcast.Smartphone smartphone = new Smartphone(podcast_server);
        Observer_Podcast_nur_das_neueste_Podcast.Notebook notebook = new Notebook(podcast_server);

        // Neues Podcast veröffentlichen
        Observer_Podcast_nur_das_neueste_Podcast.Podcast podcast1=new Podcast("Observer Pattern erklärt","www.podcast.at/folge1",
                42.5);

        podcast_server.addPodcast(podcast1);

    }
}
