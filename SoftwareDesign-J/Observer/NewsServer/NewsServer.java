package Observer.NewsServer;

import java.util.ArrayList;
import java.util.List;

public class NewsServer {

    private List<Artikel> artikels = new ArrayList<Artikel>();

    private List<Observer> observerList= new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }
    public void notifyArtikel(Artikel artikel) {
        for (Observer observer : observerList) {
            observer.update(artikel);
        }
    }
    public void addArtikel(Artikel artikel) {
        artikels.add(artikel);
    }






}
