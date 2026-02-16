package SWD_Pruefung_2020.Observer_ServerClient.Loesung;

import java.util.ArrayList;

public class RoleplayServer implements GameServer {

    ArrayList<GameClient> clients = new ArrayList<GameClient>();


    EventData lastEvent = null;

    public RoleplayServer(){
        lastEvent = null;
    }
    public ArrayList<GameClient> getClients() {
        return clients;
    }
    public EventData getLastEvent() {
        return lastEvent;
    }


    public void newEvent(String description, String url){
        lastEvent = new EventData(description, url);
        notifyObservers();
    }
    @Override
    public void registerObserver(GameClient gc) {
        clients.add(gc);
    }

    @Override
    public void removeObserver(GameClient gc) {
        clients.remove(gc);
    }

    @Override
    public void notifyObservers() {
        for(GameClient g : clients){
            g.update(lastEvent);
        }
    }
}
