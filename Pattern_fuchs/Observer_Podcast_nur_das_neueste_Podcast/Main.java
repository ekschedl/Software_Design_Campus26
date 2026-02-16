package Observer_Podcast_nur_das_neueste_Podcast;

public class Main {
    public static void main(String[] args) {
        PodcastServer podcast_server = new PodcastServer();

        // Observer registrieren sich automatisch
        Smartwatch smartwatch = new Smartwatch(podcast_server);
        Smartphone smartphone = new Smartphone(podcast_server);
        Notebook notebook = new Notebook(podcast_server);

        // Neues Podcast veröffentlichen
        Podcast podcast1=new Podcast("Observer Pattern erklärt","www.podcast.at/folge1",
                42.5);

        podcast_server.addPodcast(podcast1);

    }
}
