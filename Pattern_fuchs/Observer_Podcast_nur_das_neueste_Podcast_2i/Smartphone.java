package Observer_Podcast_nur_das_neueste_Podcast_2i;

public class Smartphone  implements Geraet_observer{

    public Server_subject server_subject;

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
