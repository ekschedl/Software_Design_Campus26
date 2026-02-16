package Observer.NewsServer;

public class Laptop implements Observer {
    public String name;
    public NewsServer newsServer;

    public Laptop(String name, NewsServer newsServer) {
        this.name = name;
        this.newsServer = newsServer;
        this.newsServer.addObserver(this);
    }

    @Override
    public void update(Artikel artikel) {
        System.out.println("Laptop "+ name + " hat einen neuen Artikel erhalten: "+artikel.getTitel());

    }

    @Override
    public String getName() {
        return name;
    }
}
