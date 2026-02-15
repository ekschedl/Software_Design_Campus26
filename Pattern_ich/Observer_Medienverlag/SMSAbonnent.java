package Observer_Medienverlag;

public class SMSAbonnent implements Abonnent {
    protected String name;
    protected Medienverlag medienverlag;

    public SMSAbonnent(String name, Medienverlag medienverlag) {
        this.name = name;
        this.medienverlag = medienverlag;
        medienverlag.addSubscriber(this);
    }

    @Override
    public String getName() {
        return name ;
    }

    @Override
    public void erhalteArtikel(Artikel artikel) {
        System.out.println(getName() + " SMSAbonnent erhalte: " + artikel.getTitle());
    }
}
