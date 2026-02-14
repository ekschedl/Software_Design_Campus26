package Observer.ObserverPatternPotcast;

public class Potcast {

    private String name;
    private String url;
    private double lengthInMinutes;


    public Potcast(String name, String url, double lengthInMinutes) {
        this.name = name;
        this.url = url;
        this.lengthInMinutes = lengthInMinutes;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Potcast: " +
                "name: " + name  +
                ", url: " + url +
                ", lengthInMinutes: " + lengthInMinutes;
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

    public double getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(double lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }
}
