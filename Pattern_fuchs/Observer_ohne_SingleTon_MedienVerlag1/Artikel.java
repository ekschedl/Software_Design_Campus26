package Observer_ohne_SingleTon_MedienVerlag1;

public class Artikel {
    private String titel;
    private String text;

    public Artikel(String titel, String text) {
        this.titel = titel;
        this.text = text;
    }

    public String getTitel() {
        return titel;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Artikel{" + "titel='" + titel + '\'' + ", text='" + text + '\'' + '}';
    }
}
