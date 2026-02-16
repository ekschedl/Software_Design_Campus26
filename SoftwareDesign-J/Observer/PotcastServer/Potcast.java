package Observer.PotcastServer;

public class Potcast {
    public String name;
    public String url;
    public double laengeInMinuten;

    public Potcast(String name, String url, double laengeInMinuten) {
        this.name = name;
        this.url = url;
        this.laengeInMinuten = laengeInMinuten;
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

    public double getLaengeInMinuten() {
        return laengeInMinuten;
    }

    public void setLaengeInMinuten(double laengeInMinuten) {
        this.laengeInMinuten = laengeInMinuten;
    }
}
