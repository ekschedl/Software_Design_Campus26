package SWD_Pruefung_2020.Observer_ServerClient;

public class AppClient  implements GameClient{
    private int version;
    private double batteryPercent; // ein wert zwischen 0 und 100
private GameServer server;

    private String lastEventURL;

    public AppClient(int version, double batteryPercent) {
        this.version = version;
        this.batteryPercent = batteryPercent;
        lastEventURL = null;
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


    @Override
    public void update(EventData evt) {

    }

    @Override
    public void startGame(GameServer server) {

    }

    @Override
    public void endGame() {

    }
}
