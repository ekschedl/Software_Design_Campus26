package Observer.GameServer_2020;


public interface GameServer {

    public void addclient(GameClient client);

    public void removeclient(GameClient client);

    public  void notifyClients(EventData eventData);


}
