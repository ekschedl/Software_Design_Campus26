package Observer.PotcastServer;

public class SmartWatch implements PotcastPlayer{
    private String name;
    private PotcastServer server;

    public SmartWatch(String name, PotcastServer server) {
        this.name = name;
        this.server = server;
        server.addPotcastPlayer(this);
    }

    @Override
    public void getPotcast(Potcast potcast) {
        System.out.println("SmartWatch "+ name + " getPotcast"+potcast.getName());
    }

    @Override
    public String getPotcastPlayerName() {
        return name;
    }
}
