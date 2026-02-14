package Observer.PotcastServer;

public class Main {
    public static void main(String[] args) {
        PotcastServer server = new PotcastServer();

        Potcast potcast1 =new Potcast("Urls","https://urls.com", 23.45);
        Potcast potcast2 =new Potcast("Potcasts","https://potcasts.com", 14.89);

        PotcastPlayer tablet= new Tablet("Tablet", server);
        PotcastPlayer smartwatch= new SmartWatch("SmartWatch", server);
        PotcastPlayer smartPhone = new SmartPhone("SmartPhone", server);

        server.updatePotcastPlayers(potcast1);
        server.updatePotcastPlayers(potcast2);
    }
}
