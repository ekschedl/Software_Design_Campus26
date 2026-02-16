package SWD_Pruefung_2020.Observer_ServerClient;

public class Main {
    // teste mich (falls du zeit hast )
    public static void main(String[] args) {
        GameClient app=new AppClient(3, 30);
        GameClient concole =new ConsoleClient("blabla");


        GameServer roleplayServer=new GameServer();
        roleplayServer.notify();
    }
}
