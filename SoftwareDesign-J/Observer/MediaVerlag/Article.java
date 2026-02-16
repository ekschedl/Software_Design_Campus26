package Observer.MediaVerlag;

public class Article {
    public String title;
    public String content;

    public Article(String content, String title) {
        this.content = content;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Article: " +
                "title='" + title+
                ", content='" + content;
    }
}
