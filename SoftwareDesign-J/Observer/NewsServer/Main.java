package Observer.NewsServer;

public class Main {
    public static void main(String[] args) {

        NewsServer server = new NewsServer();

        Artikel artikel1 = new Artikel("What about new Articles can make you happy","HappyFace");
        Artikel artikel2 = new Artikel("What about new Articles can make you sad","SadFace");

        Tablet tablet = new Tablet("Tablet", server);
        SmartPhone smartPhone = new SmartPhone("SmartPhone", server);
        Laptop laptop = new Laptop("Laptop", server);

        server.notifyArtikel(artikel1);
        server.notifyArtikel(artikel2);

    }
}
