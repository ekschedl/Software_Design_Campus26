package SWD_Pruefung_2020.Observer_ServerClient;

import java.util.ArrayList;

public class RoleplayServer extends GameServer {

    ArrayList<GameClient> clients;
    EventData lastEvent;

    public RoleplayServer(){
        lastEvent = null;
        clients = new ArrayList<GameClient>();
    }
    public ArrayList<GameClient> getClients() {
        return clients;
    }
    public EventData getLastEvent() {
        return lastEvent;
    }


    public void newEvent(String description, String url){
        lastEvent=new EventData(description,url);
        notifyClients();
    }

    public void registerClient(GameClient client){
        clients.add(client);
    }
    public void unregisterClient(GameClient client){
        clients.remove(client);
    }
    public void notifyClients (){
        for(GameClient client : clients){
            client.update(lastEvent);
        }
    }
}
