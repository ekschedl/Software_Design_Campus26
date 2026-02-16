package Observer.PotcastServer;

public class SmartPhone implements PotcastPlayer{
    private String name;
    private PotcastServer server;

    public SmartPhone(String name, PotcastServer server) {
        this.name = name;
        this.server = server;
        server.addPotcastPlayer(this);
    }

    @Override
    public void getPotcast(Potcast potcast) {
        System.out.println("SmartPhone "+ name + " getPotcast"+potcast.getName());
    }

    @Override
    public String getPotcastPlayerName() {
        return name;
    }
}
