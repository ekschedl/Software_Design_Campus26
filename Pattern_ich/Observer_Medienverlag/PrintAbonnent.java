package Observer_Medienverlag;

public class PrintAbonnent implements Abonnent {
    protected String name;
    protected Medienverlag medienverlag;

    public PrintAbonnent(String name, Medienverlag medienverlag) {
        this.name = name;
        this.medienverlag = medienverlag;
        medienverlag.addSubscriber(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void erhalteArtikel(Artikel artikel) {
        System.out.println(getName() + " PrintAbonnent erhalte: " + artikel.getTitle());
    }
}
