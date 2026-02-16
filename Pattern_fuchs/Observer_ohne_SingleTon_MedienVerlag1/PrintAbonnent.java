package Observer_ohne_SingleTon_MedienVerlag1;

public class PrintAbonnent implements Abonnent {
    private String name;
    private Medienverlag medienverlag;

    public PrintAbonnent(String name, Medienverlag medienverlag) {
        this.name = name;
        this.medienverlag = medienverlag;
        System.out.println("PrintAbonnent " + name + " erstellt.");
        medienverlag.addSubscriber(this);
    }

    @Override
    public void erhalte(Artikel artikel) {
        System.out.println(
                "--PrintAbonnent" + this.getName() +
                        " hat folgenden Artikel erhalten: \"" +
                        artikel.getTitel() + "\"");
    }

    @Override
    public String getName() {
        return name;
    }
}
