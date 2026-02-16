package Observer_mit_SingleTon_MedienVerlag2;

public class WebAbonnent implements Abonnent {
    private String name;
    private Medienverlag medienverlag;

    public WebAbonnent(String name, Medienverlag medienverlag) {
        this.name = name;
        this.medienverlag = medienverlag;
        System.out.println("WebAbonnent " + name + " erstellt.");
        medienverlag.addSubscriber(this);
    }

    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("--WebAbonnent" + this.getName() + " hat folgenden Artikel erhalten: \"" + artikel.getTitel() + "\"");
    }

    @Override
    public String getName() {
        return name;
    }
}
