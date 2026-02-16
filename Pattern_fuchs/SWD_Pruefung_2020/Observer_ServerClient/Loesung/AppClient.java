package SWD_Pruefung_2020.Observer_ServerClient.Loesung;

public class AppClient implements GameClient {
    private int version;
    private double batteryPercent;
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
        if(batteryPercent >= 20 && version >= 1000){
            System.out.println(evt.getEventDescription());
            lastEventURL = evt.getEventDataURL();
        }
    }

    @Override
    public void startGame(GameServer server) {
        this.server = server;
        server.registerObserver(this);
    }

    @Override
    public void endGame() {
        server.removeObserver(this);
        server = null;
    }
}
