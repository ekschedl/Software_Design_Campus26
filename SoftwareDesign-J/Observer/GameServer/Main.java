package Observer.GameServer;


public class Main {
    public static void main(String[] args) {


        // teste mich (falls du zeit hast )
        RoleplayServer server = new RoleplayServer();

        AppClient appClient = new AppClient(1200, 50);
        ConsoleClient consoleClient = new ConsoleClient("PlayStation");
        ConsoleClient nintendoClient = new ConsoleClient("Nintendo");

        appClient.startGame(server);
        consoleClient.startGame(server);
        nintendoClient.startGame(server);

        server.newEvent("A wild dragon appears!", "http://event1.com");
        appClient.endGame();
        server.newEvent("Treasure chest discovered!", "http://event2.com");
    }
}