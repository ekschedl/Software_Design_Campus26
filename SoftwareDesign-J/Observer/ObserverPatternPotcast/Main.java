package Observer.ObserverPatternPotcast;

public class Main {
    public static void main(String[] args) {

        System.out.println("Potcastserver 'informelle Informatik' startet....");
        PodcastServer informelleInformatik = new PodcastServer();


        Potcast potcast1 = new Potcast("Linux", "https://dieWeltDerPinguine.com",23);
        Potcast potcast2 = new Potcast("Dockers", "https://AllesUeberWale.com",79);

        PotcastPlayer walter = new NoteBook("Walter", informelleInformatik);
        PotcastPlayer gertrud = new NoteBook("Gertrude", informelleInformatik);
        PotcastPlayer anneliese = new SmartWatch("Anneliese", informelleInformatik);
        PotcastPlayer theodora = new SmartPhone("Theodora", informelleInformatik);

        informelleInformatik.addPotcast(potcast1);
        informelleInformatik.addPotcast(potcast2);
        System.out.println("-----Potcast 1 veröffentlichen-------");

        informelleInformatik.veroeffentliche(potcast1);


        System.out.println("-----Potcast 2 veröffentlichen-------");

        informelleInformatik.veroeffentliche(potcast2);
    }
}
