package SWD_Pruefung_2020.Observer_ServerClient;

public class ConsoleClient implements GameClient {
    private String system;
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

    }

    @Override
    public void startGame(GameServer server) {

    }

    @Override
    public void endGame() {

    }
}
