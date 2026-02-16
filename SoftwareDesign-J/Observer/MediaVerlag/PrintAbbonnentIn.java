package Observer.MediaVerlag;

public class PrintAbbonnentIn implements AbonnentIn{
    private String name;
    private MedienVerlag medienVerlag;

    public PrintAbbonnentIn(String name, MedienVerlag medienVerlag) {
        this.name = name;
        this.medienVerlag = medienVerlag;
        medienVerlag.addObserver(this);
    }

    @Override
    public void update(Article article) {
        System.out.println("PrintAbbonnentIn updated: "+ name+" gets this article: "+article);
    }

    @Override
    public String getName() {
        return name;
    }
}
