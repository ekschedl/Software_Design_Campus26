package SWD_Pruefung_2020.Observer_ServerClient.Loesung;

public interface GameClient {
    public void update(EventData evt);

    public void startGame(GameServer server);
    public void endGame();
}
