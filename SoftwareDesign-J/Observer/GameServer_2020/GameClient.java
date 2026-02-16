package Observer.GameServer_2020;

public interface GameClient {
    public void update(EventData evt);

    public void startGame(GameServer server);
    public void endGame();
}
