package Observer.ObserverPattern;

public class SMSAbonnent implements Abonnent{
    private  String name;
    private Medienverlag medienverlag;

    public SMSAbonnent(String name, Medienverlag medienverlag) {
        this.name = name;
        System.out.println("SMSAbonnent created"+name);
        this.medienverlag = medienverlag;
        medienverlag.addSubscriber(this);
    }

    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("SMSAbonnent "+ name + " hat eine neue SMS mit dem Artikel: "+artikel.getTitel());
    }

    @Override
    public String getName() {
        return name;
    }
}
