package Observer_Podcast_mitHistory;

public class Podcast {
    private String name;
    private String url;
    private double minutes;

    public Podcast(String n, String u, double m) {
        name = n;
        url = u;
        minutes = m;
    }
    public double getMinutes() {
        return minutes;
    }
    public String getName() {
        return name;
    }
    public String getUrl() {
        return url;
    }
    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
