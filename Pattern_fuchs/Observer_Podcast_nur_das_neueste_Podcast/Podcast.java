package Observer_Podcast_nur_das_neueste_Podcast;

public class Podcast {
    private String name;
    private String url;
    private double dauer; //in Min

    public Podcast(String name, String url, double dauer) {
        this.name = name;
        this.url = url;
        this.dauer = dauer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getDauer() {
        return dauer;
    }

    public void setDauer(double dauer) {
        this.dauer = dauer;
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", dauer=" + dauer +
                '}';
    }
}
