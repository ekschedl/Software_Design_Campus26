package Observer.NewsServer;

public class Artikel {
    public String titel;
    public String author;
    public String inhalt;

    public Artikel(String titel, String author) {
        this.titel = titel;
        this.author = author;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getInhalt() {
        return inhalt;
    }

    public void setInhalt(String inhalt) {
        this.inhalt = inhalt;
    }

    @Override
    public String toString() {
        return "Artikel: " +
                "titel: " + titel+
                ", author: " + author;
    }
}
