package SWD_Pruefung_2020.Observer_ServerClient.Loesung;

public interface GameServer {
    public void registerObserver(GameClient gc);

    public void removeObserver(GameClient gc);

    public void notifyObservers();
}
