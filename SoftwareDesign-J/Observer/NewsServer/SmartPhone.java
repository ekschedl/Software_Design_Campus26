package Observer.NewsServer;

public class SmartPhone implements Observer {
    public String name;
    public NewsServer newsServer;

    public SmartPhone(String name, NewsServer newsServer) {
        this.name = name;
        this.newsServer = newsServer;
        this.newsServer.addObserver(this);
    }

    @Override
    public void update(Artikel artikel) {
        System.out.println("SmartPhone "+ name + " hat einen neuen Artikel erhalten: "+artikel.getTitel());

    }

    @Override
    public String getName() {
        return name;
    }
}
