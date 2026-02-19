package Observer_Podcast_mitHistory_2i;

public class Main {

    public static void main(String[] args) {

        PodcastServer pS = new PodcastServer();

        Notebook nb = new Notebook(pS);
        pS.addPodcast(new Podcast("Sendung 1", "sendung1.campus02.at", 20));



        Smartphone sp = new Smartphone(pS);
        Smartwatch sw = new Smartwatch(pS);

        pS.addPodcast(new Podcast("Sendung 2", "sendung2.campus02.at", 40));

    }

}
