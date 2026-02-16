package Observer.GameServer_2020;

public class AppClient implements GameClient {
    private int version;
    private double batteryPercent; // ein wert zwischen 0 und 100
    private GameServer gameServer;

    private String lastEventURL;

    public AppClient(int version, double batteryPercent) {
        this.version = version;
        this.batteryPercent = batteryPercent;
        lastEventURL = null;

    }

    @Override
    public void update(EventData evt) {
        if (batteryPercent >= 20 && version >= 1000) {
            System.out.println(evt.getEventDescription());
            lastEventURL = evt.getEventDataURL();
        }
    }

    @Override
    public void startGame(GameServer server) {
        this.gameServer = server;
        server.addclient(this);
    }

    @Override
    public void endGame() {

    }

    public String getLastEventURL() {
        return lastEventURL;
    }

    public int getVersion() {
        return version;
    }

    public double getBatteryPercent() {
        return batteryPercent;
    }


}
