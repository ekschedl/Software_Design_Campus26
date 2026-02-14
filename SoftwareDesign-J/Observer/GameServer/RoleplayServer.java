package Observer.GameServer;


import java.util.ArrayList;

public class RoleplayServer implements GameServer {

    private ArrayList<GameClient> clients;
    private EventData lastEvent;

    public RoleplayServer() {
        lastEvent = null;
        clients = new ArrayList<GameClient>();
    }

    public ArrayList<GameClient> getClients() {
        return clients;
    }

    public EventData getLastEvent() {
        return lastEvent;
    }

    @Override
    public void addclient(GameClient client) {
        clients.add(client);
    }

    @Override
    public void removeclient(GameClient client) {
        clients.remove(client);
    }

    @Override
    public void notifyClients(EventData event) {
        for (GameClient thisClient : clients) {
            thisClient.update(event);
        }

    }

    public void newEvent(String description, String url) {
        lastEvent = new EventData(description, url);
        notifyClients(lastEvent);
    }

}
