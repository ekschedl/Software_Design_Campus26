package Observer.PotcastServer_1i1a;

public class Tablet implements PotcastPlayer{
    private String name;
    private PotcastServer server;

    public Tablet(String name, PotcastServer server) {
        this.name = name;
        this.server = server;
        server.addPotcastPlayer(this);
    }

    @Override
    public void getPotcast(Potcast potcast) {
        System.out.println("Tablet "+ name + " getPotcast"+potcast.getName());
    }

    @Override
    public String getPotcastPlayerName() {
        return name;
    }
}
