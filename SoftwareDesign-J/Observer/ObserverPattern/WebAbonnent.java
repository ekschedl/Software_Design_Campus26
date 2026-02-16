package Observer.ObserverPattern;

public class WebAbonnent implements Abonnent{
    private  String name;
    private Medienverlag medienverlag;

    public WebAbonnent(String name, Medienverlag medienverlag) {
        this.name = name;
        System.out.println("WebAbbonent created"+name);
        this.medienverlag = medienverlag;
        medienverlag.addSubscriber(this);
    }

    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("WebAbonnent "+ name + " hat einen neuen Link mit dem Artikel: "+artikel.getTitel());
    }

    @Override
    public String getName() {
        return name;
    }
}
