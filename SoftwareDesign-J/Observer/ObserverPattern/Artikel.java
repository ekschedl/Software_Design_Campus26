package Observer.ObserverPattern;

public class Artikel {

    private String titel;
    private String content;

    public Artikel(String titel, String content) {
        this.titel = titel;
        this.content = content;
    }

    public String getTitel() {
        return titel;
    }

    @Override
    public String toString() {
        return "Artikel: " +
                "titel: " + titel +
                ", content: " + content;
    }
}
