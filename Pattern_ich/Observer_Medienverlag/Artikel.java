package Observer_Medienverlag;

public class Artikel {
    protected String title;
    protected String text;

    public Artikel(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
