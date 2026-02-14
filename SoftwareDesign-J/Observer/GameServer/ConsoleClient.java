package Observer.GameServer;


public class ConsoleClient implements GameClient {
    private String system;
    private String lastEventURL;
    private GameServer gameServer;


    public ConsoleClient(String system) {

        this.system = system;
        lastEventURL = null;


    }

    @Override
    public void update(EventData evt) {
        if (!"Nintendo".equalsIgnoreCase(system)) {
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

            gameServer.removeclient(this);

    }

    public String getSystem() {
        return system;
    }

    public String getLastEventURL() {
        return lastEventURL;
    }


}
