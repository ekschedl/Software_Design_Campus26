package Observer.ObserverPattern;

public class PrintAbonnent implements Abonnent{
    private  String name;
    private Medienverlag medienverlag;

    public PrintAbonnent(String name, Medienverlag medienverlag) {
        this.name = name;
        System.out.println("PrintAbonnent created"+name);
        this.medienverlag = medienverlag;
        medienverlag.addSubscriber(this);
    }

    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("printAbonnent "+ name + " hat eine neue Zeitung mit dem Artikel: "+artikel.getTitel());
    }

    @Override
    public String getName() {
        return name;
    }
}
