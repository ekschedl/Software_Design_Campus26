package Observer.MediaVerlag;

public class WebAbbonnentIn implements AbonnentIn{
    private String name;
    private MedienVerlag medienVerlag;

    public WebAbbonnentIn(String name, MedienVerlag medienVerlag) {
        this.name = name;
        this.medienVerlag = medienVerlag;
        medienVerlag.addObserver(this);
    }

    @Override
    public void update(Article article) {
        System.out.println("WebAbbonnentIn updated: "+ name+" gets this article: "+article);
    }

    @Override
    public String getName() {
        return name;
    }
}
