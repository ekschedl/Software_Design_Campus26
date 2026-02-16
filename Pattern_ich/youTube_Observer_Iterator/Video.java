package youTube_Observer_Iterator;

public class Video {
    protected String title;
    protected String beschreibung;

    public Video(String title, String beschreibung) {
        this.title = title;
        this.beschreibung = beschreibung;
    }

    public String getTitle() {
        return title;
    }

    public String getBeschreibung() {
        return beschreibung;
    }
}
