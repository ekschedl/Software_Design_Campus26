package Observer_Medienverlag;

public class WebAbonnent implements Abonnent {
    public String name;
    protected Medienverlag medienverlag;

    public WebAbonnent(String name, Medienverlag medienverlag) {
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
        System.out.println( getName() + " WebAbonnent erhalte: " + artikel.getTitle());
    }
}
