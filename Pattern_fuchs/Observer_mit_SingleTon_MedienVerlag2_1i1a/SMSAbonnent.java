package Observer_mit_SingleTon_MedienVerlag2_1i1a;

public class SMSAbonnent implements Abonnent {
    private String name;
    private Medienverlag medienverlag;

    public SMSAbonnent(String name, Medienverlag medienverlag) {
        this.name = name;
        this.medienverlag = medienverlag;
        System.out.println("SMSAbonnent " + name + " erstellt.");
        medienverlag.addSubscriber(this);
    }

    @Override
    public void erhalte(Artikel artikel) {
        System.out.println(
                "--SMSAbonnent" + this.getName() +
                        " hat folgenden Artikel erhalten: \"" +
                        artikel.getTitel() + "\"");
    }

    @Override
    public String getName() {
        return name;
    }
}
