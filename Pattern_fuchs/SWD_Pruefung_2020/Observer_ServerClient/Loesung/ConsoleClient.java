package SWD_Pruefung_2020.Observer_ServerClient.Loesung;


public class ConsoleClient implements GameClient {
    private String system;
    private GameServer server;
    private String lastEventURL;

    public ConsoleClient(String system) {

        this.system = system;
        lastEventURL = null;
    }


    public String getSystem() {
        return system;
    }

    public String getLastEventURL() {
        return lastEventURL;
    }

    @Override
    public void update(EventData evt) {
        if(!system.equals("Nintendo")){
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
